import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (user.equals("admin") && pass.equals("1234")) {
            out.println("<h2>Login Successful!</h2>");
        } else {
            out.println("<h2>Invalid Username or Password</h2>");
        }
    }
}