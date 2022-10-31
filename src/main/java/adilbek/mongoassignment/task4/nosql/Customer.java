package adilbek.mongoassignment.task4.nosql;

import adilbek.mongoassignment.task4.model.PaymentHistory;
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
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private PaymentHistory paymentHistory;
}
