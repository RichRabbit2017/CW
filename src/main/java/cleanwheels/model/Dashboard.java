package cleanwheels.model;

/**
 * Created by Sarvaraj.Singh on 05-10-2017.
 */
public class Dashboard {
    String userId;
    String city;

    Dashboard()
    {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
