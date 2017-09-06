package cleanwheels.controller;

import cleanwheels.model.Article;
import cleanwheels.services.interfaces.BookInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by sarvaraj.singh on 25-08-2017.
 */
@Controller
public class controller {

    @Autowired
    public BookInter bookInter;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Article>> get() {
        List<Article> response = bookInter.getAllBooks();

        return new ResponseEntity<List<Article>>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> gets() {
        List<Article> response = bookInter.getAllBooks();
        int count = response.size();

        return new ResponseEntity("hello"+count, HttpStatus.OK);
    }
}
