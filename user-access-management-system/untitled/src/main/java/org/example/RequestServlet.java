package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        int userId = (int) session.getAttribute("userId");
        System.out.println(userId);
        int softwareId = Integer.parseInt(request.getParameter("softwareId"));
        String accessType = request.getParameter("accessType");
        String reason = request.getParameter("reason");

        try (Connection conn = DatabaseConfig.getConnection()) {
            String sql = "INSERT INTO requests (user_id, software_id, access_type, reason, status) VALUES (?, ?, ?, ?, 'Pending')";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, userId);
                stmt.setInt(2, softwareId);
                stmt.setString(3, accessType);
                stmt.setString(4, reason);
                stmt.executeUpdate();
                System.out.println("query is esxuting");
            }
          request.setAttribute("success","Request Submitted Successfully");
           RequestDispatcher requestDispatcher= request.getRequestDispatcher("/WEB-INF/views/requestAccess.jsp");
           requestDispatcher.forward(request,response);

        } catch (Exception e) {
            System.out.println("exception in the query"+e.getMessage());
            request.setAttribute("error", "Request submission failed: " + e.getMessage());
            request.getRequestDispatcher("requestAccess.jsp").forward(request, response);
        }
    }
}
