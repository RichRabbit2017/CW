package cleanwheels.dao.interfaces;

import cleanwheels.responsemodel.RegisterResponse;
import cleanwheels.model.User;

import java.util.List;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
public interface IUserDAO {

    public RegisterResponse addUser(User user);
    public Boolean updateUser(User user);
    public User findUserById(String id);
    public Boolean deleteUser(String id);

    public List<User> getAllUser();
    User findByEmailOrMobile(String emailormobile);
}
