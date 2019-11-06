package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;
import guru.springproject.didemo.service.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
    public GreetingServiceInterface greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
