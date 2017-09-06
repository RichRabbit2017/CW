package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "attendant")
public class Attendant {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @NotNull
    @Column(name = "attendant_id")
    @Size(max = 30)
    private String userId;


    @Column(name = "first_name")
    @Size(max = 30)
    private String firstName;


    @Column(name = "last_name")
    @Size(max = 30)
    private String lastName;


    @Column(name = "adhaar_no")
    @Size(max = 30)
    private String adhaarNo;


    @Column(name = "permanent_address")
    @Size(max = 30)
    private String permanentAdd;


    @Column(name = "mobile_number")
    @Size(max = 30)
    private String MobileNo;


    @Column(name = "email_id")
    @Size(max = 30)
    private String emailId;
}
