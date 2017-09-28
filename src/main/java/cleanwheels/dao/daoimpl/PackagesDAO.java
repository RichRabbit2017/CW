package cleanwheels.dao.daoimpl;

import cleanwheels.dao.interfaces.IPackagesDAO;
import cleanwheels.model.Packages;
import cleanwheels.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by sarvaraj.singh on 28-09-2017.
 */
@Transactional
@Repository
public class PackagesDAO implements IPackagesDAO {

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List<Packages> findPackageByCity(String city) {

        TypedQuery<Packages> tq = entityManager.createQuery("from Packages WHERE city = :value", Packages.class);
        List<Packages> result = tq.setParameter("value", city).getResultList();
        return result;
    }

    @Override
    public Packages findPackageByCityAndCategory(String category, String city) {
        TypedQuery<Packages> tq = entityManager.createQuery("from Packages WHERE city = :city and category = :category", Packages.class);
       tq.setParameter("city",city);
        tq.setParameter("category",category);
         Packages  result = tq.getSingleResult();
        return result;
    }

    @Override
    public List<Packages> getAllPackages() {
        String hql = "FROM Packages";
        return (List<Packages>) entityManager.createQuery(hql).getResultList();
    }
}
