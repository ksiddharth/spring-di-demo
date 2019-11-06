package guru.springproject.didemo.controller;

import guru.springproject.didemo.service.GreetingServiceImpl;
import guru.springproject.didemo.service.GreetingServiceInterface;

public class SetterInjectedController {
    private GreetingServiceInterface greetingService;

    public void setGreetingService(GreetingServiceInterface greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
