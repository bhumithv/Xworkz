package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward to signup page
        request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Basic validation
        if (username == null || username.trim().isEmpty() ||
                password == null || password.trim().isEmpty()) {
            request.setAttribute("error", "Username and password are required");
            request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
            return;
        }

        // Password confirmation check
        if (!password.equals(confirmPassword)) {
            request.setAttribute("error", "Passwords do not match");
            request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
            return;
        }

        try (Connection conn = DatabaseConfig.getConnection()) {
            // Check if username already exists
            if (isUsernameExists(conn, username)) {
                request.setAttribute("error", "Username already exists");
                request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
                return;
            }

            // Insert new user
            String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, username);
                // In production, you should hash the password before storing
                stmt.setString(2, password);
                stmt.setString(3, "Employee"); // Default role for new users

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    // Registration successful
                    request.setAttribute("success", "Registration successful! Please login.");
                    response.sendRedirect(request.getContextPath() + "/login");
                } else {
                    // Registration failed
                    request.setAttribute("error", "Registration failed. Please try again.");
                    request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
                }
            }
        } catch (SQLException e) {
            // Log the exception in production
            e.printStackTrace();
            request.setAttribute("error", "An error occurred during registration. Please try again.");
            request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
        }
    }

    private boolean isUsernameExists(Connection conn, String username) throws SQLException {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
}
