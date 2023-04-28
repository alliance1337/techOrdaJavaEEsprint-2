package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBConnection;
//import javax.servlet.*;
import java.io.IOException;


@WebServlet(value = "/login")
//public class LoginServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/login.jsp").forward(request,response);
//    }
//}


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (DBConnection.isUserExist(email, password)) {
            // переход на страницу профиля
            response.sendRedirect("/profile.jsp");
//            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        } else {
            // отображение сообщения об ошибке
            request.setAttribute("error", "Invalid email or password");
            request.getRequestDispatcher("/failedlogin.jsp").forward(request, response);
        }
    }
}

