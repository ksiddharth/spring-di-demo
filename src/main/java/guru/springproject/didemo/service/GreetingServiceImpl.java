package guru.springproject.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingServiceInterface {
    public static final String HELLO = "hello";
    public String sayGreeting() {
        return HELLO;
    }
}
