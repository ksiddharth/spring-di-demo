package guru.springproject.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "Greetings from Primary service";
    }
}
