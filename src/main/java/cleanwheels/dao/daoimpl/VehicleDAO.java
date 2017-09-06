package cleanwheels.dao.daoimpl;

import cleanwheels.dao.interfaces.IVehicleDAO;
import cleanwheels.model.User;
import cleanwheels.model.Vehicle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */

@Transactional
@Repository
public class VehicleDAO implements IVehicleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Boolean addVehicle(Vehicle vehicle) {
        entityManager.persist(vehicle);
        return true;
    }

    @Override
    public Boolean updateVehicle(Vehicle vehicle) {
        User userObj = findVehicleById(vehicle.getId());
      //  userObj.setMobileNo(vehicle.getMobileNo());
        // userObj.setCategory(article.getCategory());
        entityManager.flush();
        return true;
    }

    @Override
    public User findVehicleById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public Boolean deleteVehicle(int id) {
        entityManager.remove(findVehicleById(id));
        return  true;
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        String hql = "FROM Vehicle";
        return (List<Vehicle>) entityManager.createQuery(hql).getResultList();
    }
}
