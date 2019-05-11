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

        PizzaEntity pizzaTest = new PizzaEntity();
        pizzaTest.setIngirdients("Test");
        pizzaTest.setName("LA CHINGONA");
        pizzaTest.setSizeOne("20cm");
        pizzaTest.setSizeOnePrice("200");
        pizzaTest.setSizeTwo("35cm");
        pizzaTest.setSizeTwoPrice("250");
        System.out.println(pizzaTest);
        PizzaManagement.altaPizza(pizzaTest);

        //Check if session wants to be done
        if(request.getParameter("logout") != null)
        {
            session.invalidate();
            response.sendRedirect("login");
            return;
        }//    and see if session an username are already set if true redirect to home
        else if(session.getAttribute("username") != null)
        {
            response.sendRedirect("home");
            return;
        }
        if (session.getAttribute("loginFailed") == null){
            session.setAttribute("loginFailed",false);
        }
//        request.getRequestDispatcher("login-page.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
            response.sendRedirect("home");
        } else{
            request.setAttribute("loginFailed", true);

            response.setStatus(401);
            request.getRequestDispatcher("login-page.jsp").forward(request, response);
        }
    }
}
