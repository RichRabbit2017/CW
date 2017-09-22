package cleanwheels.services.serviceimpl;

import cleanwheels.dao.interfaces.IUserDAO;
import cleanwheels.responsemodel.RegisterResponse;
import cleanwheels.model.User;
import cleanwheels.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;


    @Override
    public RegisterResponse addUser(User user) {
      return   userDAO.addUser(user);

    }

    @Override
    public Boolean updateUser(User user) {
        return  userDAO.updateUser(user);
    }

    @Override
    public User findUserById(String id) {
        User obj = userDAO.findUserById(id);
        return obj;
    }

    @Override
    public Boolean deleteUser(String id) {
       return userDAO.deleteUser(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public User findByEmailOrMobile(String emailormobile) {
       return userDAO.findByEmailOrMobile(emailormobile);

    }
}
