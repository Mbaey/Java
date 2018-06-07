package com.nwnu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nwnu.bean.User;
import com.nwnu.dao.UserDAO;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new UserDAO().getUser(name, password);
        if (null != user) {
            request.getSession().setAttribute("userName", user.getName());
            request.getSession().setAttribute("userId", user.getId());
            response.sendRedirect(request.getContextPath()+ "/index.jsp");
        } else
            response.sendRedirect(request.getContextPath()+"/login.jsp");
 
    }
}
