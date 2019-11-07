package guru.springproject.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class SpanishGreetingServiceImpl implements GreetingServiceInterface{
    @Override
    public String sayGreeting() {
        return "Sayanora!";
    }
}
