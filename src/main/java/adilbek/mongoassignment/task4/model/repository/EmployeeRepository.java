package adilbek.mongoassignment.task4.model.repository;

import adilbek.mongoassignment.task4.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
