

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
            // Create a session for the user
            String sessionId = java.util.UUID.randomUUID().toString();
            request.getSession().setAttribute("sessionId", sessionId);

            // Generate the HTML response with hidden form field
            String htmlResponse = "<html><body>"
                    + "<h1>Welcome</h1>"
                    + "<form action='WelcomeServlet' method='post'>"
                    + "<input type='hidden' name='sessionId' value='" + sessionId + "' />"
                    + "<input type='submit' value='Continue' />"
                    + "</form>"
                    + "</body></html>";
            response.getWriter().println(htmlResponse);
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
