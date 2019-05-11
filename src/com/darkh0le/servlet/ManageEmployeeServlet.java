package com.darkh0le.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.darkh0le.model.EmployeeEntity;
import com.darkh0le.model.PizzaManagement;
import com.darkh0le.model.Operation;
import com.google.gson.Gson;

/**
 * @author $darkh0le
 */
@WebServlet(name = "ManageEmployeeServlet" , urlPatterns = "/manage")
public class ManageEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("doPost Employee");


//        PrintWriter out = response.getWriter();
//        response.setContentType("text/plain");
//
//        Enumeration<String> parameterNames = request.getParameterNames();
//
//        while (parameterNames.hasMoreElements()) {
//
//            String paramName = parameterNames.nextElement();
//            out.write(paramName + "\n");
//
//            String[] paramValues = request.getParameterValues(paramName);
//            for (int i = 0; i < paramValues.length; i++) {
//                String paramValue = paramValues[i];
//                out.write(paramValue + "\n");
//            }
//
//        }

        //Placeholder employee
        EmployeeEntity employeeEntity = null;
        Operation operation = null;
        String test = request.getParameter("employee");
        System.out.println("Employee info: " + test);

        //Get the operation from operation parameter
        try {
            operation = Operation.valueOf(request.getParameter("operation").toUpperCase());
            System.out.println("Operation: " + operation);
        } catch (IllegalArgumentException e) {
            System.out.println("No operation found");
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Somthing went wrong while getting the operation");
            return;
        }

        //Serialize employee
        try {
            Gson gson = new Gson();
            System.out.println("Getting employee:");
            System.out.println(request.getParameter("employee"));
            System.out.println("Employee from employee parameter: " + request.getParameter("employee"));
            employeeEntity = gson.fromJson(request.getParameter("employee"), EmployeeEntity.class);
            System.out.println(employeeEntity);
            System.out.println(operation);
            //Check if id exits
            if (employeeEntity.getId() == -1 && operation != Operation.INSERT) {
                System.out.println("No id provided!");
                request.setAttribute("error","NO ID PROVIDED");
                request.getRequestDispatcher("ShowEmployees.jsp").forward(request,response);
                throw new Exception("No id founded");
            }

        } catch (Exception e) {
            System.out.println("Employee parsing failed");
            e.printStackTrace();
            return;
        } finally {
            if(employeeEntity == null){
                System.out.println("No employee found");
            }
        }

        //Execute operation
        PizzaManagement.EmployeeOperations(employeeEntity, operation , response);


//        PrintWriter out = response.getWriter();
//        response.setContentType("text/plain");
//
//        Enumeration<String> parameterNames = request.getParameterNames();
//
//        while (parameterNames.hasMoreElements()) {
//
//            String paramName = parameterNames.nextElement();
//            out.write(paramName);
//            out.write("n");
//
//            String[] paramValues = request.getParameterValues(paramName);
//            for (int i = 0; i < paramValues.length; i++) {
//                String paramValue = paramValues[i];
//                out.write(paramValue + "\n");
//            }
//
//        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
