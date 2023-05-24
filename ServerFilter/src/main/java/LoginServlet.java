

import java.io.IOException;
import javax.servlet.*;
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
            response.setContentType("text/html");
            response.getWriter().println("<html>");
            response.getWriter().println("<head>");
            response.getWriter().println("<title>Login Successful</title>");
            response.getWriter().println("</head>");
            response.getWriter().println("<body>");
            response.getWriter().println("<h1>Login Successful</h1>");
            response.getWriter().println("<p>Welcome, " + username + "!</p>");
            response.getWriter().println("</body>");
            response.getWriter().println("</html>");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<html>");
            response.getWriter().println("<head>");
            response.getWriter().println("<title>Login Failed</title>");
            response.getWriter().println("</head>");
            response.getWriter().println("<body>");
            response.getWriter().println("<h1>Login Failed</h1>");
            response.getWriter().println("<p>Invalid username or password. Please try again.</p>");
            response.getWriter().println("</body>");
            response.getWriter().println("</html>");
        }
    }

    private boolean isValidUser(String username, String password) {
        // For demonstration purposes, let's consider "admin" as the valid username and "password" as the valid password
        return username.equals("admin") && password.equals("password");
    }
}
