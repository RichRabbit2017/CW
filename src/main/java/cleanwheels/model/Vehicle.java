package cleanwheels.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @NotNull
    @Column(name = "user_id")
    private String userId;

    @org.hibernate.annotations.Type(type="true_false")
    @Column(name = "active")
    private boolean isActive = false;

    @Column(name = "vehicle_no")
    @Size(max = 30)
    private String vehicle_number;

    @Column(name = "vehicle_type")
    @Size(max = 30)
    private String vehicle_type;

    @Column(name = "vehicle_category")
    @Size(max = 30)
    private String vehicle_category;

    @Column(name = "cleaner_id")
    @Size(max = 30)
    private String cleanerId;

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

    @Column(name = "appartment_number")
    @Size(max = 30)
    private String appartment_number;

    @Column(name = "parking_location")
    @Size(max = 30)
    private String parking_location;

    @Column(name = "start_date")
    @Size(max = 30)
    private String start_date;

    @Column(name = "end_date")
    @Size(max = 30)
    private String end_date;

    @Column(name = "bonus_days")
    @Size(max = 30)
    private String bonus_days;


    Vehicle()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_category() {
        return vehicle_category;
    }

    public void setVehicle_category(String vehicle_category) {
        this.vehicle_category = vehicle_category;
    }

    public String getAttendent_id() {
        return cleanerId;
    }

    public void setAttendent_id(String attendent_id) {
        this.cleanerId = attendent_id;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getAppartment_number() {
        return appartment_number;
    }

    public void setAppartment_number(String appartment_number) {
        this.appartment_number = appartment_number;
    }

    public String getParking_location() {
        return parking_location;
    }

    public void setParking_location(String parking_location) {
        this.parking_location = parking_location;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getBonus_days() {
        return bonus_days;
    }

    public void setBonus_days(String bonus_days) {
        this.bonus_days = bonus_days;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(String cleanerId) {
        this.cleanerId = cleanerId;
    }
}
