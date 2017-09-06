package cleanwheels.services.serviceimpl;

import cleanwheels.model.Article;
import cleanwheels.services.interfaces.BookInter;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sarvaraj.singh on 25-08-2017.
 */
@Repository
@Transactional
public class BookImpl implements BookInter {

    @PersistenceContext
    private EntityManager entityManager;
//    @Autowired
//    private SessionFactory sessionFactory;
    @Override
    public List<Article> getAllBooks() {
        String hql = "FROM Article ";

        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Article").list();
       // return (List<Article>)entityManager.createQuery(hql).getResultList();
    }

//    public Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }
}
