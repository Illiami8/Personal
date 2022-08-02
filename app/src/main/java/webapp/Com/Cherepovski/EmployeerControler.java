package webapp.Com.Cherepovski;

import repositories.EmloyeesRepositoryInMemory;
import repositories.EmployeesRepository;
import repositories.RepositoryInFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/employees")
public class EmployeerControler extends HttpServlet{

//EmployeesRepositoryPostgres
    private EmployeesRepository employeeRepository = RepositoryInFactory.getEmployeesRepository();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        req.setAttribute("employees",employeeRepository.findAll());//азвание атрибута , который мы передаем через реквест
        req.getRequestDispatcher("employees.jsp").forward(req,resp);// сначала попадаем на html ,
        // делаем переход сюда, а отсюда передаем на jsp

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        req.setAttribute("employees",employeeRepository.findAll());//азвание атрибута , который мы передаем через реквест
        req.getRequestDispatcher("employees.jsp").forward(req,resp);// сначала попадаем на html ,
        // делаем переход сюда, а отсюда передаем на jsp

    }
}
