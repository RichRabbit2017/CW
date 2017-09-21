package cleanwheels.dao.daoimpl;

import cleanwheels.common.Constants;
import cleanwheels.dao.interfaces.IUserDAO;
import cleanwheels.model.Article;
import cleanwheels.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
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

    @Override
    public Boolean addUser(User user) {
//System.out.println(user.getFirstName().substring(0,3)+randomNumber());
       // user.setReferralCode(user.getFirstName().substring(0,3)+randomNumber);
          entityManager.persist(user);
        return true;
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

    @Override
    public User findByEmailOrMobile(String emailormobile) {

        User result = null;
        try {

            if(emailormobile.matches("[0-9]+"))
        {
            TypedQuery<User> tq = entityManager.createQuery("from User WHERE mobile_no = :value", User.class);
           result = tq.setParameter("value",emailormobile).getSingleResult();
        }else {
            TypedQuery<User> tq = entityManager.createQuery("from User WHERE column=?", User.class);
           result = tq.setParameter("email_id", emailormobile).getSingleResult();

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
