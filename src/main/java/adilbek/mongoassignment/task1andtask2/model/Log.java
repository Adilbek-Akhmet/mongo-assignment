package adilbek.mongoassignment.task1andtask2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "logs")
public class Log {

    @Id
    private String id;

    private String ip;
    private String url;
    private LocalDateTime timeStamp;
    private String timeSpent;

    public Log(String ip, String url, LocalDateTime timeStamp, String timeSpent) {
        this.ip = ip;
        this.url = url;
        this.timeStamp = timeStamp;
        this.timeSpent = timeSpent;
    }
}
