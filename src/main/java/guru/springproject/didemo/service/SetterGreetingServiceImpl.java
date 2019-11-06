package guru.springproject.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingServiceInterface{
    public String sayGreeting() {
        return "Setter Greetings";
    }
}
