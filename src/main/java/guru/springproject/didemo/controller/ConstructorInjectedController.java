package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;
import guru.springproject.didemo.service.GreetingServiceInterface;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingServiceInterface greetingService;
    public ConstructorInjectedController(GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
