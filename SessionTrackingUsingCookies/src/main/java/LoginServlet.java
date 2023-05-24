

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (isValidUser(username, password)) {
            // Create a session for the user
            String sessionId = java.util.UUID.randomUUID().toString();
            request.getSession().setAttribute("sessionId", sessionId);

            // Set the session ID in a cookie
            Cookie sessionCookie = new Cookie("sessionId", sessionId);
            sessionCookie.setMaxAge(60 * 60 * 24); // Cookie expires in 24 hours
            response.addCookie(sessionCookie);

            response.sendRedirect("Welcome.html");
        } else {
            response.sendRedirect("index.html");
        }
    }

    private boolean isValidUser(String username, String password) {
        // Implement your validation logic here
        // For demonstration purposes, let's consider "admin" as the valid username and "password" as the valid password
        return username.equals("admin") && password.equals("password");
    }
}
