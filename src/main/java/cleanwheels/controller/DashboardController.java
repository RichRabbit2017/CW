package cleanwheels.controller;

import cleanwheels.model.Dashboard;
import cleanwheels.model.User;
import cleanwheels.services.interfaces.IDashboardService;
import cleanwheels.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sarvaraj.Singh on 05-10-2017.
 */
@Controller
@RequestMapping("/test")
@CrossOrigin( maxAge = 100)
public class DashboardController {
    @Autowired
    private IDashboardService dashboardService;

    @PostMapping("/dashboard")
    public ResponseEntity<Boolean> dashboard(@RequestBody Dashboard dashboard) {
        Boolean response = dashboardService.getDashboardContent(dashboard);
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }

}
