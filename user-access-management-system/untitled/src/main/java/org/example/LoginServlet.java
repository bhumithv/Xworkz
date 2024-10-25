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
import java.sql.ResultSet;
@WebServlet("/login")
public class LoginServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (Connection conn = DatabaseConfig.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, username);
                stmt.setString(2, password); // In production, verify hashed password
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("userId", rs.getInt("id"));
                    session.setAttribute("username", username);
                    session.setAttribute("role", rs.getString("role"));

                    switch (rs.getString("role")) {
                        case "Employee":
                           // response.sendRedirect(request.getContextPath()+"/requestAccess.jsp");
                            RequestDispatcher re=request.getRequestDispatcher("/WEB-INF/views/requestAccess.jsp");
                            re.forward(request,response);
                            break;
                        case "Manager":
                          //  response.sendRedirect("/WEB-INF/views/pendingRequests.jsp");
                            RequestDispatcher re1=request.getRequestDispatcher("/WEB-INF/views/pendingRequests.jsp");
                            re1.forward(request,response);

                            break;
                        case "Admin":
                          //  response.sendRedirect("/WEB-INF/views/createSoftware.jsp");
                            RequestDispatcher re2=request.getRequestDispatcher("/WEB-INF/views/createSoftware.jsp");
                            re2.forward(request,response);
                            break;
                    }
                } else {
                    request.setAttribute("error", "Invalid credentials");
                    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
                }
            }
        } catch (Exception e) {
            request.setAttribute("error", "Login failed: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}
