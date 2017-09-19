package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "offers")
public class Offers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "code")
    @Size(max = 30)
    private String code;

    @NotNull
    @Column(name = "amount")
    @Size(max = 30)
    private String amount;

    @NotNull
    @Column(name = "description")
    @Size(max = 30)
    private String description;


    @NotNull
    @Column(name = "UsesType")
    @Size(max = 30)
    private String usesType;

    @Column(name = "short_description")
    @Size(max = 30)
    private String shortDescription;

    @NotNull
    @Column(name = "long_description")
    @Size(max = 30)
    private String longDescription;


    @Column(name = "expiry")
    @Size(max = 30)
    private String expiry;

    @Column(name = "uses_type")
    @Size(max = 30)
    private String usesType;

    @Column(name = "user_id")
    @Size(max = 30)
    private String UserId ="";

}
