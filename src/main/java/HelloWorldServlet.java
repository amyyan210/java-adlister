import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String name = req.getParameter("name");

        res.setContentType("text/html"); //is of this type automatically, so is optional

        PrintWriter out = res.getWriter();

        if (name != null || name.trim().isEmpty()) {
            out.println("<h1>Hello, " + name + "!</h1>");
        }  else {
            out.println("<h1>Hello, world!</h1>");
        }

    }
}
