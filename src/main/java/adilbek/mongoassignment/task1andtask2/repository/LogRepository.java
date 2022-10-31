package adilbek.mongoassignment.task1andtask2.repository;

import adilbek.mongoassignment.task1andtask2.model.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface LogRepository extends MongoRepository<Log, String> {
    Page<Log> findAll(Pageable pageable);
    List<Log> findAllByUrl(String url);
    List<Log> findAllByTimeStampBetween(LocalDateTime time1, LocalDateTime time2);
    List<Log> findAllByIpOrderByUrl(String url);
}
