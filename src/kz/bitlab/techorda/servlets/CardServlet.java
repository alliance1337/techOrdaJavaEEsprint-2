package kz.bitlab.techorda.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.techorda.db.DBConnection;


import kz.bitlab.techorda.db.Items;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/card")
public class CardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = -1;
        try {
            id = Integer.parseInt(request.getParameter("item_id"));
        }catch (Exception e){

        }
        Items item = DBConnection.getItem(id);
        request.setAttribute("oneitem", item);
        request.getRequestDispatcher("/items.jsp").forward(request,response);
    }

}
