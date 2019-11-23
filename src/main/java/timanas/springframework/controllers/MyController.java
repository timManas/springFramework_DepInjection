package timanas.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by timmanas on 2019-11-23.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");

        return "foo";
    }
}