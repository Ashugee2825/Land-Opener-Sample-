// AddLandownerServlet.java
package com.landowner.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.landowner.dao.LandownerDAO;
import com.landowner.dao.LandownerDAOImpl;
import com.landowner.models.Landowner;

public class AddLandownerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        Landowner landowner = new Landowner();
        landowner.setName(name);
        landowner.setAddress(address);
        landowner.setPhone(phone);

        LandownerDAO landownerDAO = new LandownerDAOImpl();
        boolean success = landownerDAO.addLandowner(landowner);

        if(success) {
            response.sendRedirect("view_landowners.jsp");
        } else {
            response.getWriter().println("Failed to add landowner");
        }
    }
}