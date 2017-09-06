package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "packages")
public class Packages implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    @Size(max = 30)
    private String name;

    @NotNull
    @Column(name = "description")
    @Size(max = 30)
    private String description;

    @NotNull
    @Column(name = "price")
    @Size(max = 30)
    private String price;

    @NotNull
    @Column(name = "vehicle_category")
    @Size(max = 30)
    private String vehicleCategory;

    @NotNull
    @Column(name = "vehicle_price")
    @Size(max = 30)
    private String vehiclePrice;

    @NotNull
    @Column(name = "state")
    @Size(max = 30)
    private String state;

    @NotNull
    @Column(name = "city")
    @Size(max = 30)
    private String city;
}
