import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogooutServlet", urlPatterns = "/logout")
public class LogooutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // To logout
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();

        response.sendRedirect("/login");

    }
}
