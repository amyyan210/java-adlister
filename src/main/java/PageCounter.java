import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class PageCounter extends HttpServlet {
    int pageCount = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String count = req.getParameter("count");

        if (count != "") {
            out.println("Page views: " + pageCount);
        } else {
            out.println("Page views: 0");
        }

        pageCount++;
    }
}
