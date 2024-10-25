package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/approve")
public class ApprovalServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int requestId = Integer.parseInt(request.getParameter("requestId"));
        String status = request.getParameter("status"); // "Approved" or "Rejected"

        try (Connection conn = DatabaseConfig.getConnection()) {
            String sql = "UPDATE requests SET status = ? WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, status);
                stmt.setInt(2, requestId);
                stmt.executeUpdate();
            }
            response.sendRedirect("pendingRequests.jsp");
        } catch (Exception e) {
            request.setAttribute("error", "Approval action failed: " + e.getMessage());
            request.getRequestDispatcher("pendingRequests.jsp").forward(request, response);
        }
    }

}
