package guru.springproject.service;

import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingServiceImpl implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "Greetings from property injector";
    }
}
