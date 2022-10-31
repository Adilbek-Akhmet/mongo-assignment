package adilbek.mongoassignment.task4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

//    @Id
    private Integer id;
    private String cardInfo;

//    @OneToOne
    private Customer customer;

//    @OneToOne
    private SlrCamera slrCamera;
}
