package by.teachmeslills.nikamotors.controller;

import by.teachmeslills.nikamotors.dto.user.UserResponse;
import by.teachmeslills.nikamotors.servis.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class StartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Jsp/authentication.jsp").forward(req,resp);
    }
    public void doPost(HttpServletRequest  req, HttpServletResponse  resp) throws ServletException, IOException{
        UserService userService = new UserService();
        userService.authentication("login","password");
         req.getRequestDispatcher("Jsp/authentication.jsp").forward(req,resp);

    }
}
