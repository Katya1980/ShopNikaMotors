package by.teachmeslills.nikamotors.controller;

import by.teachmeslills.nikamotors.entity.User;
import by.teachmeslills.nikamotors.repository.FileRepository;
import by.teachmeslills.nikamotors.repository.ShopRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShopRepository repository = new FileRepository();
        req.setAttribute("users", repository.allUsers());
        req.getRequestDispatcher("user.jsp");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String surname = req.getParameter("surname");
        FileRepository fileRepository = new FileRepository();
        User user = new User();
        user.setName(login);
        user.setSurname(name);
        user.setLogin(password);
        user.getPassword(surname);
        fileRepository.add(user);
        req.getRequestDispatcher("/user.jsp").forward(req,resp);




    }
}
