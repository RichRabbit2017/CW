package cleanwheels.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "user_id", unique = true)
	private String id;

	@NotNull
	@Column(name = "user_name")
	@Size(max = 30)
	private String userName;

	@NotNull
	@Column(name = "user_type")
	@Size(max = 10)
	private String userType;

	@Column(name = "first_name")
	@Size(max = 20)
	private String firstName;


	@Column(name = "last_name")
	@Size(max = 20)
	private String lastName;


	@Column(name = "mobile_no")
	@Size(max = 10)
	private String mobileNo;


	@Column(name = "email_id")
	@Size(max = 50)
	private String emailId;

//	@Column(name = "flat_no")
//	@Size(max = 10)
//	private String flatNo;
//
//	@Column(name = "tower_no")
//	@Size(max = 10)
//	private String towerNo;
//
//	@Column(name = "society")
//	@Size(max = 10)
//	private String society;
//
//	@Column(name = "sector")
//	@Size(max = 10)
//	private String sector;
//
//	@Column(name = "block")
//	@Size(max = 5)
//	private String block;
//
//	@Column(name = "city")
//	@Size(max = 15)
//	private String city;
//
//	@Column(name = "state")
//	@Size(max = 15)
//	private String state;
//
//	@Column(name = "vehicle_no")
//	@Size(max = 10)
//	private String vehicleNo;
//
//	@Column(name = "vehicle_type")
//	@Size(max = 10)
//	private String vehicleType;
//
//	@Column(name = "vehicle_category")
//	@Size(max = 5)
//	private String vehicleCategory;

	@NotNull
	@Column(name = "password")
	@Size(max = 15)
	private String password;

//	@Column(name = "is_active", nullable = false, columnDefinition = "tinyint default 1")
//	private byte isActive = 1;

	public User() {
	}

//	public User(String firstName, String lastName, String mobileNo, String emailId, String password) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.mobileNo = mobileNo;
//		this.emailId = emailId;
//		this.password = password;
//	}

	public User(String userName, String mobileNo, String emailId, String password, String userType) {
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
		this.userType = userType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}


//	public String getFlatNo() {
//		return flatNo;
//	}
//
//	public void setFlatNo(String flatNo) {
//		this.flatNo = flatNo;
//	}
//
//	public String getTowerNo() {
//		return towerNo;
//	}
//
//	public void setTowerNo(String towerNo) {
//		this.towerNo = towerNo;
//	}
//
//	public String getSociety() {
//		return society;
//	}
//
//	public void setSociety(String society) {
//		this.society = society;
//	}
//
//	public String getSector() {
//		return sector;
//	}
//
//	public void setSector(String sector) {
//		this.sector = sector;
//	}
//
//	public String getBlock() {
//		return block;
//	}
//
//	public void setBlock(String block) {
//		this.block = block;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getVehicleNo() {
//		return vehicleNo;
//	}
//
//	public void setVehicleNo(String vehicleNo) {
//		this.vehicleNo = vehicleNo;
//	}
//
//	public String getVehicleType() {
//		return vehicleType;
//	}
//
//	public void setVehicleType(String vehicleType) {
//		this.vehicleType = vehicleType;
//	}
//
//	public String getVehicleCategory() {
//		return vehicleCategory;
//	}
//
//	public void setVehicleCategory(String vehicleCategory) {
//		this.vehicleCategory = vehicleCategory;
//	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}