package cleanwheels.services.serviceimpl;

import cleanwheels.dao.interfaces.IUserDAO;
import cleanwheels.dao.interfaces.IVehicleDAO;
import cleanwheels.model.User;
import cleanwheels.model.Vehicle;
import cleanwheels.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
@Service
public class VehicleServiceImpl implements IVehicleService {

    @Autowired
    private IVehicleDAO vehicleDAO;
    @Override
    public Boolean addVehicle(Vehicle vehicle) {
        return   vehicleDAO.addVehicle(vehicle);
    }

    @Override
    public Boolean updateVehicle(Vehicle vehicle) {
        return  vehicleDAO.updateVehicle(vehicle);
    }

    @Override
    public Vehicle findVehicleById(int id) {
        Vehicle obj = vehicleDAO.findVehicleById(id);
        return obj;
    }

    @Override
    public Boolean deleteVehicle(int id) {
        return vehicleDAO.deleteVehicle(id);
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleDAO.getAllVehicle();
    }
}
