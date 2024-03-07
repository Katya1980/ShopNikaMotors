package by.teachmeslills.nikamotors.controller;

import by.teachmeslills.nikamotors.dto.user.UserRequest;
import by.teachmeslills.nikamotors.dto.user.UserResponse;
import by.teachmeslills.nikamotors.servis.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserService();
        List<UserResponse> userResponses = userService.allUsers();
        req.setAttribute("users", userResponses);
        req.getRequestDispatcher("" + "Jsp/user1.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String surname = req.getParameter("surname");
        UserService userService = new UserService();
        HttpSession httpSession=req.getSession(false);
        //       FileRepository fileRepository = new FileRepository();
//        User user = new User();
//        user.setName(login);
//        user.setSurname(name);
//        user.setLogin(password);
//        user.getPassword(surname);
        UserRequest userRequest = new UserRequest();
        userRequest.setName(name);
        userRequest.setSurname(surname);
        userRequest.setLogin(login);
        userRequest.setPassword(password);
        UserResponse userResponse=userService.add(userRequest);
        httpSession.setAttribute("user",userResponse);
//        if (userResponse.getSurname()){
 //           req.getRequestDispatcher("Jsp/user.jsp").forward(req, resp);
//        }else {
//            req.getRequestDispatcher("Jsp/user.jsp").forward(req, resp);
//        }
////        fileRepository.add(userRequest);
//        req.getRequestDispatcher("Jsp/user.jsp").forward(req, resp);

    }

}
