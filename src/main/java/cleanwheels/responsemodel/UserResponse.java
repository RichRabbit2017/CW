package cleanwheels.responsemodel;

import cleanwheels.model.User;

import java.util.List;

/**
 * Created by sarvaraj.singh on 22-09-2017.
 */
public class UserResponse {
   List<User> allusers;

    public List<User> getAllusers() {
        return allusers;
    }

    public void setAllusers(List<User> allusers) {
        this.allusers = allusers;
    }
}
