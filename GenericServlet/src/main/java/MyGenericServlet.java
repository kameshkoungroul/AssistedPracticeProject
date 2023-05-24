

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MyGenericServlet")
public class MyGenericServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        String name = request.getParameter("name");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<title>Generic Servlet Demo</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Whats your name</h1>");
        response.getWriter().println("<p>Welcome, " + name + "!</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
