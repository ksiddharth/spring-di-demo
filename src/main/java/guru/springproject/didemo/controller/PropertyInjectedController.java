package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    GreetingServiceImpl getGreetingService() {
        return greetingService;
    }
}
