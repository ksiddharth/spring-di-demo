package guru.springproject.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingServiceInterface {
    public String sayGreeting() {
        return "Greetings from constructor service";
    }
}
