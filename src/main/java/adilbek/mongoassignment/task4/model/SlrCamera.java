package adilbek.mongoassignment.task4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlrCamera {

//    @Id
    private Long id;
    private String name;
    private Integer quantity;
    private String description;
    private String model;
    private String productType;
    private String lensType;
}
