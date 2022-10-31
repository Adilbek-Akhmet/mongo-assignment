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
public class Employee extends User {

    //    @Id
    private Integer id;

    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private Double salary;
}
