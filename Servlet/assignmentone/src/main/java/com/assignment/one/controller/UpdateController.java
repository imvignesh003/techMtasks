package com.assignment.one.controller;

import java.io.IOException;
import java.util.List;

import com.assignment.one.model.User;
import com.assignment.one.service.UserService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class UpdateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        UserService userService = new UserService();
        User user = userService.getUserByEmail(email);
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/updateUser.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");

        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPhone(phone);
        user.setAddress(address);
        user.setGender(gender);

        UserService userService = new UserService();
        boolean isUpdated = userService.updateUser(user);
        response.getWriter().write("Update Status: " + isUpdated);
    }
}
