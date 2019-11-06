package guru.springproject.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Primary
public class PrimaryGreetingService implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "Greetings from Primary service";
    }
}
