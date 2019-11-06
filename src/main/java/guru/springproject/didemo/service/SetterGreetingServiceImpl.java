package guru.springproject.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingServiceInterface{
    public String sayGreeting() {
        return "Greetings from setter service";
    }
}
