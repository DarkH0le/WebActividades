package com.darkh0le.servlet;

import com.darkh0le.model.EmployeeManagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author $darkh0le
 */

public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
//            EmployeeManagement.getAllTables();
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("home-page.jsp")
                .forward(request, response);
    }
}
