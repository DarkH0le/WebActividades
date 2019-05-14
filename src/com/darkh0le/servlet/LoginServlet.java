package com.darkh0le.servlet;

import com.darkh0le.model.PizzaEntity;
import com.darkh0le.model.PizzaManagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

/**
 * @author $darkh0le
 */
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("In doPost LoginServlet2");

        HttpSession session = request.getSession();

        //Check if session wants to be done
        if(request.getParameter("logout") != null)
        {
            session.invalidate();
            response.sendRedirect("");
            return;
        }//    and see if session an username are already set if true redirect to home
        else if(session.getAttribute("username") != null)
        {
            response.sendRedirect("/login-page.jsp");
            return;
        }
        if (session.getAttribute("loginFailed") == null){
            session.setAttribute("loginFailed",false);
        }
        request.getRequestDispatcher("/login-page.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("LOGGGGINGINGING");
        HttpSession session = request.getSession();
        if(session.getAttribute("loginEmail") != null)
        {
            response.sendRedirect("home");
            return;
        }

        String username = request.getParameter("loginEmail");
        String password = request.getParameter("loginPassword");
        String failed = request.getParameter("loginFailed");

        if(((username == null) || (password == null)))
        {
            request.setAttribute("loginFailed", "provided user and password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else if (Objects.equals(username, "root") && Objects.equals(password, "toor"))
        {
            session.setAttribute("username", username);
            request.changeSessionId();
            System.out.println(request.getRequestURI());
            System.out.println(request.getRequestURL());
            response.sendRedirect(String.valueOf(request.getRequestURI()));
        } else{
            request.setAttribute("loginFailed", true);

            response.setStatus(401);
            request.getRequestDispatcher("login-page.jsp").forward(request, response);
        }
    }
}
