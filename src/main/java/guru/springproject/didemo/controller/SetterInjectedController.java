package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;
import guru.springproject.didemo.service.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingServiceInterface greetingService;

    @Autowired
    public void setGreetingService(GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
