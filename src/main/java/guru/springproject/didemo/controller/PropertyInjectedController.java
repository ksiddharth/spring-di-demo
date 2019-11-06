package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    GreetingServiceImpl getGreetingService() {
        return greetingService;
    }
}
