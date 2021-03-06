package pl.piasecki.controllers;

import org.springframework.stereotype.Controller;
import pl.piasecki.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }

}
