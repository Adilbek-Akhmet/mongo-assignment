package adilbek.mongoassignment.task4.nosql.repository;


import adilbek.mongoassignment.task4.nosql.SlrCamera;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CameraRepository extends MongoRepository<SlrCamera, String> {
}
