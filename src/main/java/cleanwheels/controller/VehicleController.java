package cleanwheels.controller;


import cleanwheels.exception.CleanWheelsException;
import cleanwheels.model.User;
import cleanwheels.model.Vehicle;
import cleanwheels.responsemodel.RegisterResponse;
import cleanwheels.services.interfaces.IUserService;
import cleanwheels.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secure")
public class VehicleController {
    @Autowired
    private IVehicleService vehicleService;
    @PostMapping("/addvehicle")
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) throws CleanWheelsException {
        boolean response = vehicleService.addVehicle(vehicle);
        return new ResponseEntity<String>("Successfully", HttpStatus.OK);
    }

    @PostMapping("/updatevehicle")
    public ResponseEntity<String> updateVehicle(@RequestBody Vehicle vehicle) throws CleanWheelsException {
        boolean response = vehicleService.updateVehicle(vehicle);
        return new ResponseEntity<String>("Successfully", HttpStatus.OK);
    }
}
