package guru.springproject.service;

public class PrimaryGreetingService implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "Greetings from Primary service";
    }
}
