package repositories;

import com.Cherepovski.personal.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class EmloyeesRepositoryPostgres implements EmployeesRepository{
    private Map<Long, Employee> map = new ConcurrentHashMap<>();
    private volatile static EmloyeesRepositoryPostgres instance;

    private EmloyeesRepositoryPostgres() {
        map.put(1L, new Employee(1L, "Polia", 22, 1540));
        map.put(2L, new Employee(2L, "Anna", 22, 1000));
    }

    public static EmloyeesRepositoryPostgres getInstance() {
        if (instance == null) {
            synchronized (EmloyeesRepositoryPostgres.class) {
                if (instance == null) {
                    instance = new EmloyeesRepositoryPostgres();
                }
            }
        }
        return instance;
    }

    public List<Employee> findAll() {
        return map.values().stream()
                .collect(Collectors.toList());
    }

    public Optional<Employee> find(long id) {
        return Optional.ofNullable(map.get(id));
    }

    public Employee save(Employee employee) {
        Long id = employee.getId();
        if (id == null) {
            id = generatedId();
            employee.setId(id);
        }
        map.put(id, employee);
        return employee;
    }

    private long generatedId() {
        long id;
        do {
            id = ThreadLocalRandom.current().nextLong(1, 1000);
        } while (map.containsKey(id));//проверяем содержиться ли такой айдишник в маппе
        return id;
    }

    public Optional<Employee> remove(long id) {
        return Optional.ofNullable(map.remove(id));
    }
}
