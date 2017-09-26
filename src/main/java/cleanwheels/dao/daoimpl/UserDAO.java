package cleanwheels.dao.daoimpl;

import cleanwheels.common.Constants;
import cleanwheels.dao.interfaces.IUserDAO;
import cleanwheels.responsemodel.RegisterResponse;
import cleanwheels.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
@Transactional
@Repository
public class UserDAO implements IUserDAO {
//
//    @Autowired
//    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;




    int randomNumber()
    {
        Random rn = new Random();
        int range = Constants.MAX_NUMBER - Constants.MIN_NUMBER + 1;
      return rn.nextInt(range) + Constants.MIN_NUMBER;

    }

   Calendar addExpiry()
    {
        Calendar date = Calendar.getInstance();
        date.add(Calendar.MONTH, 1);
        return date;
    }

    @Override
    public RegisterResponse addUser(User user) {

        RegisterResponse registerResponse = new RegisterResponse();

        if(findDuplicate(user.getMobileNo(),user.getEmailId())>0)
        {
            registerResponse.setErrorCode("100");
            registerResponse.setMessage("Email or Mobile Number already in used");
           // throw new CleanWheelsException("Email or Mobile Number already in use","100");

        }

      //  System.out.println("referral code : "+user.getEmailId().substring(0,3)+randomNumber());
        user.setReferralCode(user.getEmailId().substring(0,3)+randomNumber());
     //   System.out.println("expiry :"+addExpiry().getTime());
        user.setExpiry(addExpiry().getTime());
        entityManager.persist(user);
        registerResponse.setMessage("Successfully register");

        return registerResponse;
    }

    @Override
    public Boolean updateUser(User user) {
        User userObj = findUserById(user.getId());
        userObj.setMobileNo(user.getMobileNo());
       // userObj.setCategory(article.getCategory());
        entityManager.flush();
        return true;
    }

    @Override
    public User findUserById(String id) {
        return entityManager.find(User.class, id);

    }

    @Override
    public Boolean deleteUser(String id) {
       entityManager.remove(findUserById(id));
       return  true;
    }

    @Override
    public List<User> getAllUser() {
        String hql = "FROM User";
        return (List<User>) entityManager.createQuery(hql).getResultList();
    }

    public int findDuplicate(String mobileNo,String emailId)
    {
        User result= null;
        TypedQuery<User> tq = entityManager.createQuery("from User WHERE mobile_no = :mobile or email_id = :mailid", User.class);
        tq.setParameter("mobile", mobileNo);
        tq.setParameter("mailid", emailId);
      List<User> resultList =  tq.getResultList();
      return resultList.size();
    }

    @Override
    public User findByEmailOrMobile(String emailormobile) {

        User result = null;
        try {

            if(emailormobile.matches("[0-9]+"))
        {
            TypedQuery<User> tq = entityManager.createQuery("from User WHERE mobile_no = :value", User.class);
           result = tq.setParameter("value",emailormobile).getSingleResult();
        }else {
            TypedQuery<User> tq = entityManager.createQuery("from User WHERE email_id = :value", User.class);
           result = tq.setParameter("value", emailormobile).getSingleResult();

        }


        } catch(NoResultException noresult) {
            // if there is no result
        } catch(NonUniqueResultException notUnique) {
            // if more than one result
        }
//        User obj =  entityManager.find(User.class, emailormobile);
        return result;
    }

//    public Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }
}
