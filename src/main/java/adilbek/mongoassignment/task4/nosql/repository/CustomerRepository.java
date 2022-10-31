package adilbek.mongoassignment.task4.nosql.repository;

import adilbek.mongoassignment.task4.nosql.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
