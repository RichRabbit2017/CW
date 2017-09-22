package cleanwheels.controller;

import cleanwheels.common.Constants;
import cleanwheels.exception.CleanWheelsException;
import cleanwheels.responsemodel.JwtTokenModel;
import cleanwheels.responsemodel.RegisterResponse;
import cleanwheels.model.User;
import cleanwheels.services.interfaces.IUserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

/**
 * Created by sarvaraj.singh on 21-09-2017.
 */
@Controller
@RequestMapping("/user")
@CrossOrigin( maxAge = 100)
public class LoginController {
    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> addUser(@RequestBody User user) throws CleanWheelsException {
        RegisterResponse response = userService.addUser(user);
        return new ResponseEntity<RegisterResponse>(response, HttpStatus.OK);
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<JwtTokenModel> login(@RequestBody User login) throws ServletException {

        String jwtToken = "";

        if ((login.getEmailId() == null||login.getMobileNo()== null) && login.getPassword() == null) {
            throw new ServletException("Please fill in username and password");
        }

        String email = login.getEmailId();
        String password = login.getPassword();

        User user;

            user = userService.findByEmailOrMobile(login.getMobileNo());




        if (user == null) {
            throw new ServletException("User email not found.");
        }

        String pwd = user.getPassword();

        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }

        jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").setExpiration(new Date(System.currentTimeMillis() + Constants.EXPIRATIONTIME)).compact();
        System.out.println("token"+jwtToken);
        JwtTokenModel token = new JwtTokenModel();
        token.setToken(jwtToken);
        return new ResponseEntity<JwtTokenModel>(token, HttpStatus.OK);
    }
}
