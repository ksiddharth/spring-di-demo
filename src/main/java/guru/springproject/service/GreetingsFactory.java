package guru.springproject.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingsFactory {
    GreetingServiceInterface getGreetings(String lang) {
        switch(lang) {
            case "es":
                return new SpanishGreetingServiceImpl();
            case "de":
                return new GermanGreetingsServiceImpl();
            default:
                return new PrimaryGreetingService();
        }
    }
}
