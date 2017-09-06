package cleanwheels.dao.daoimpl;

import cleanwheels.dao.interfaces.IUserDAO;
import cleanwheels.model.Article;
import cleanwheels.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

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

    @Override
    public Boolean addUser(User user) {
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

//    public Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }
}
