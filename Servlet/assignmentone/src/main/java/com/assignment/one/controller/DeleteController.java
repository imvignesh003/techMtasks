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

public class DeleteController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        System.out.println(email);
        if (email == null || email.isEmpty()) {
            response.getWriter().write("Email parameter is missing or empty.");
            return;
        }
        UserService userService = new UserService();
        boolean isDeleted = userService.deleteUserByEmail(email);
        response.getWriter().write("Delete Status: " + isDeleted);
    }
}
