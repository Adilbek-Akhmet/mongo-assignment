package adilbek.mongoassignment.task1andtask2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogDto {
    private String ip;
    private String url;
    private String timeStamp;
    private String timeSpent;
}
