package cleanwheels.controller;

import cleanwheels.model.Article;
import cleanwheels.model.User;
import cleanwheels.services.interfaces.IArticleService;
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
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getuser")
    public ResponseEntity<List<User>> getAllArticles() {
        List<User> list = userService.getAllUser();
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
    @GetMapping("removeuser/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id")  String id) {
        Boolean list = userService.deleteUser(id);
        return new ResponseEntity<Boolean>(list, HttpStatus.OK);
    }
    @PostMapping("adduser")
    public ResponseEntity<Boolean> addUser(@RequestBody User user) {
        Boolean response = userService.addUser(user);
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }

    @PostMapping("updateuser")
    public ResponseEntity<Boolean> updateUser(@RequestBody User user) {
        Boolean response = userService.updateUser(user);
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }
    @PostMapping("find")
    public ResponseEntity<User> getArticleById(@RequestBody  String id) {
        User article = userService.findUserById(id);
        return new ResponseEntity<User>(article, HttpStatus.OK);
    }
}
