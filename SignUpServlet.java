import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the form parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String terms = request.getParameter("terms");

        // Set the response content type
        response.setContentType("text/html");

        // Get a PrintWriter object to send HTML response
        PrintWriter out = response.getWriter();

        // Write the HTML response
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello"+firstName+"Sign Up Successful</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Sign Up Information</h2>");
        out.println("<p>First Name: " + firstName + "</p>");
        out.println("<p>Last Name: " + lastName + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("<p>Confirm Password: " + confirmPassword + "</p>");
        out.println("<p>Terms Accepted: " + (terms != null ? "Yes" : "No") + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
