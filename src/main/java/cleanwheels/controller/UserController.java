package cleanwheels.controller;

import cleanwheels.model.User;
import cleanwheels.responsemodel.UserObj;
import cleanwheels.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sarvaraj.singh on 31-08-2017.
 */
@Controller
@RequestMapping("/secure")
@CrossOrigin( maxAge = 100)
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getuser")
    public ResponseEntity<UserObj> getAllArticles() {
        List<User> list = userService.getAllUser();
     UserObj b =   new UserObj();
     b.setAllusers(list);

        return new ResponseEntity<UserObj>(b, HttpStatus.OK);
    }
    @GetMapping("removeuser/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id")  String id) {
        Boolean list = userService.deleteUser(id);
        return new ResponseEntity<Boolean>(list, HttpStatus.OK);
    }
//    @PostMapping("/register")
//    public ResponseEntity<Boolean> addUser(@RequestBody User user) {
//        Boolean response = userService.addUser(user);
//        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
//    }

    @PostMapping("/updateuser")
    public ResponseEntity<Boolean> updateUser(@RequestBody User user) {
        Boolean response = userService.updateUser(user);
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }
    @PostMapping("find")
    public ResponseEntity<User> getArticleById(@RequestBody  String id) {
        User article = userService.findUserById(id);
        return new ResponseEntity<User>(article, HttpStatus.OK);
    }


//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public User registerUser(@RequestBody User user) {
//        return userService.save(user);
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@RequestBody User login) throws ServletException {
//
//        String jwtToken = "";
//
//        if ((login.getEmailId() == null||login.getMobileNo()== null) && login.getPassword() == null) {
//            throw new ServletException("Please fill in username and password");
//        }
//
//        String email = login.getEmailId();
//        String password = login.getPassword();
//
//        User user;
//        if(login.getMobileNo().matches("[0-9]+"))
//        {
//             user = userService.findByEmailOrMobile(login.getMobileNo());
//        }else
//            user = userService.findByEmailOrMobile(login.getEmailId());
//
//
//
//        if (user == null) {
//            throw new ServletException("User email not found.");
//        }
//
//        String pwd = user.getPassword();
//
//        if (!password.equals(pwd)) {
//            throw new ServletException("Invalid login. Please check your name and password.");
//        }
//
//        jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
//                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
//
//        return jwtToken;
//    }
}
