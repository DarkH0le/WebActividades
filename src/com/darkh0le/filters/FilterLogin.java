package com.darkh0le.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author $darkh0le
 */
@WebFilter(filterName = "FilterLogin")
public class FilterLogin implements Filter {

    FilterConfig fl;

    public void init(FilterConfig config) throws ServletException {
        this.fl = config;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        fl.getServletContext().log("Filtering: FilterLogin fired");

        //Will return current session if current session exists, notice it will not create a new session
        HttpSession session = ((HttpServletRequest)request).getSession(false);

        //If not username return to login page
        if(session == null || session.getAttribute("username") == null)
            ((HttpServletResponse)response).sendRedirect("login");
        //continue the chain
        else
            chain.doFilter(request, response);
    }

    public void destroy() {
        fl.getServletContext().log("Destroying filter: FilterLogin");
    }



}
