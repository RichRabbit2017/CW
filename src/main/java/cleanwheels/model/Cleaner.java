package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cleaner")
public class Cleaner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "cleaner_id")
    @Size(max = 30)
    private String cleanerId;


    @Column(name = "user_id")
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

    @Column(name = "state")
    @Size(max = 30)
    private String state;

    @Column(name = "city")
    @Size(max = 30)
    private String city;

    @Column(name = "sector")
    @Size(max = 30)
    private String sector;

    @Column(name = "society")
    @Size(max = 30)
    private String society;

    @Column(name = "block")
    @Size(max = 30)
    private String block;

    @Column(name = "email_id")
    @Size(max = 30)
    private String emailId;
}
