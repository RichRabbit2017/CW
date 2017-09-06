package cleanwheels.services.interfaces;



import cleanwheels.model.User;
import cleanwheels.model.Vehicle;

import java.util.List;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
public interface IVehicleService {

    public Boolean addVehicle(Vehicle vehicle);
    public Boolean updateVehicle(Vehicle vehicle);
    public Vehicle findVehicleById(int id);
    public Boolean deleteVehicle(int id);
    public List<Vehicle> getAllVehicle();
}
