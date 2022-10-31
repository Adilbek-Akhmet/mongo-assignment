package adilbek.mongoassignment.task4.nosql;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "camera")
public class SlrCamera {

    @Id
    private String id;
    private String name;
    private Integer quantity;
    private String description;
    private String model;
    private String productType;
    private String lensType;
}
