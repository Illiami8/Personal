package repositories;

import com.Cherepovski.personal.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public interface EmployeesRepository {
     List<Employee> findAll();

     Optional<Employee> find(long id);

     Employee save(Employee employee);

     Optional<Employee> remove(long id);
}

