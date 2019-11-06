package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;
import guru.springproject.didemo.service.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingServiceInterface greetingService;
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
