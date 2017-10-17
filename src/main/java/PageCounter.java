import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class PageCounter extends HttpServlet {
    int counter = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String reset = req.getParameter("reset");

        if (reset != null) {
            out.println("<h2>Page views: " + counter + "</h2>");
            counter = 0;
        } else {
            out.println("<h2>Page views: " + counter + "</h2>");
        }
        counter++;
    }
}
