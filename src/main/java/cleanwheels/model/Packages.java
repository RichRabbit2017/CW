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


    @Column(name = "short_description")
    @Size(max = 30)
    private String shortDescription;


    @Column(name = "long_description")
    @Size(max = 30)
    private String longDescription;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(String vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
