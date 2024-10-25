package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
@WebServlet("/software")
public class SoftwareServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String accessLevels = request.getParameter("accessLevels");

        try (Connection conn = DatabaseConfig.getConnection()) {
            String sql = "INSERT INTO software (name, description, access_levels) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                stmt.setString(2, description);
                stmt.setString(3, accessLevels);
                stmt.executeUpdate();
            }
            request.setAttribute("success","Software Submitted Successfully");
            RequestDispatcher requestDispatcher= request.getRequestDispatcher("/WEB-INF/views/createSoftware.jsp");
            requestDispatcher.forward(request,response);
        } catch (Exception e) {
            request.setAttribute("error", "Software creation failed: " + e.getMessage());
            request.getRequestDispatcher("createSoftware.jsp").forward(request, response);
        }
    }
}
