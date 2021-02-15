package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString

//@Entity(name = "Customer")       //This way name of the entity and table name can be changed Customer_details
@Entity
@Table(name = "Customer")        //In this case name of the entity will be Customer but the table name will be Customer_details
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "custId")
    private int custId;

    @OneToMany(mappedBy = "customer")
    private List<Address> addressList;

    @Column(name="email", nullable = false, unique = true)
    private String emailId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name="gender")
    private String gender;

    @Column(name = "DOB")
    private LocalDate dob;

    public Customer(List<Address> addressList, String emailId, String firstName, String lastName, String gender, LocalDate dob) {
        this.addressList = addressList;
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

}
