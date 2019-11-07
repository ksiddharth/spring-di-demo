package guru.springproject.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class GermanGreetingsServiceImpl implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "German Hello!!";
    }
}
