package guru.springproject.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingServiceInterface {
    public String sayGreeting() {
        return "Constructor Greeting Service Hello";
    }
}