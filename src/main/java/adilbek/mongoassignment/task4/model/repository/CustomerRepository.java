package adilbek.mongoassignment.task4.model.repository;

import adilbek.mongoassignment.task4.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
