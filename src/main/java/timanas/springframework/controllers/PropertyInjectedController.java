package timanas.springframework.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import timanas.springframework.services.GreetingService;
import timanas.springframework.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}