package webapp.Com.Cherepovski;

import com.Cherepovski.personal.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/employees")
public class EmployeerControler extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setAttribute("employees", List.of(new Employee()));
req.getRequestDispatcher("employees.jsp").forward(req, res);
    }
}
