package cleanwheels.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "user_id", unique = true)
    private String id;


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

    @NotNull
    @Column(name = "mobile_no")
    @Size(max = 10)
    private String mobileNo;

    @NotNull
    @Column(name = "email_id")
    @Size(max = 50)
    private String emailId;

//    @Lob
//    @Basic(fetch = FetchType.LAZY)
//    @Column(name = "user_img", nullable = true, columnDefinition = "longblob")
//    private byte[] user_img;

    @NotNull
    @Column(name = "password")
    @Size(max = 15)
    private String password;

    @org.hibernate.annotations.Type(type="true_false")
    @NotNull
    @Column(name = "active")
    private boolean isActive;


    @Column(name = "referred_code")
    @Size(max = 30)
    private String referredCode;


    @Column(name = "referral_code")
    @Size(max = 30)
    private String referralCode;


    @Temporal(TemporalType.DATE)
    @Column(name = "expiry")
    private Date expiry;

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

//    public User(byte[] user_img) {
//        this.user_img = user_img;
//
//    }

    public User( String mobileNo, String emailId, String password, String userType,String referredCode,boolean isActive) {
     //   this.userName = userName;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.password = password;
        this.userType = userType;
        this.referredCode = referredCode;
        this.isActive = isActive;
       // this.expiry =
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

//  public void setUser_img(byte[] user_img) {
//        this.user_img = user_img;
//    }

//    public byte[] getUser_img() {
//        return user_img;
//    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getReferredCode() {
        return referredCode;
    }

    public void setReferredCode(String referredCode) {
        this.referredCode = referredCode;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}