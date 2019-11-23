package timanas.springframework.controllers;

import org.springframework.stereotype.Controller;
import timanas.springframework.services.GreetingService;

/**
 * Created by timmanas on 2019-11-23.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}