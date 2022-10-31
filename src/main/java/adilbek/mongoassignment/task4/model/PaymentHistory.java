package adilbek.mongoassignment.task4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentHistory {

//    @Id
    private Long id;
    private String customerName;
    private Double price;
    private String address;
}
