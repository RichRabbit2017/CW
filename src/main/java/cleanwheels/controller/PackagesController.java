package cleanwheels.controller;

import cleanwheels.exception.CleanWheelsException;
import cleanwheels.model.Packages;
import cleanwheels.model.Vehicle;
import cleanwheels.responsemodel.PackagesResonse;
import cleanwheels.services.interfaces.IPackagesService;
import cleanwheels.services.interfaces.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sarvaraj.singh on 28-09-2017.
 */

@Controller
@RequestMapping("/test")
@CrossOrigin( maxAge = 100)
public class PackagesController {
    @Autowired
    private IPackagesService packagesService;

    @GetMapping("/getpackage/{city}")
    public ResponseEntity<PackagesResonse> findPackageByCity(@PathVariable("city")  String city) throws CleanWheelsException {
      List<Packages> packages = packagesService.findPackageByCity(city);

      PackagesResonse response = new PackagesResonse();
      response.setPackages(packages);
        return new ResponseEntity<PackagesResonse>(response, HttpStatus.OK);
    }

    @GetMapping("/getpackagebycategory/{category}/{city}")
    public ResponseEntity<PackagesResonse> findPackageByCityAndCategory(@PathVariable("category")  String category,@PathVariable("city")  String city) throws CleanWheelsException {
        Packages packages = packagesService.findPackageByCityAndCategory(category,city);

        PackagesResonse response = new PackagesResonse();
        response.setMonthly_package(packages);
        return new ResponseEntity<PackagesResonse>(response, HttpStatus.OK);
    }
}
