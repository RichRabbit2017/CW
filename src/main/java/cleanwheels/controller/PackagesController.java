package cleanwheels.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sarvaraj.singh on 28-09-2017.
 */

@Controller
@RequestMapping("/secure")
@CrossOrigin( maxAge = 100)
public class PackagesController {
}
