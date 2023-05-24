

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (isValidUser(username, password)) {
            // Get or create a session for the user
            HttpSession session = request.getSession();
            String sessionId = session.getId();

            // Store data in the session
            session.setAttribute("username", username);

            // Redirect to the welcome page
            response.sendRedirect("WelcomeServlet");
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

