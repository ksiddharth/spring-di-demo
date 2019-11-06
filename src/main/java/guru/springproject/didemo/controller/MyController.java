package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    GreetingServiceInterface greetingsService;

    public String printHello() {
        return greetingsService.sayGreeting();
    }
}
