package guru.springproject.service;

public class GermanGreetingsServiceImpl implements GreetingServiceInterface {
    @Override
    public String sayGreeting() {
        return "German Hello!!";
    }
}
