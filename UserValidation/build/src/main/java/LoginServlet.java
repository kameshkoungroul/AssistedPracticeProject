

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (isValidUser(username, password)) {
            // Valid login, redirect to success page
            response.sendRedirect("success.html");
        } else {
            // Invalid login, redirect back to login page
            response.sendRedirect("login.html");
        }
    }

    private boolean isValidUser(String username, String password) {
        // Implement your login validation logic here
        // For demonstration purposes, let's consider "admin" as the valid username and "password" as the valid password
        return username.equals("admin") && password.equals("password");
    }
}

