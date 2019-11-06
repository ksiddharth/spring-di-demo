package guru.springproject.didemo.service;

public class GreetingServiceImpl implements  GreetingServiceInterface {
    public static final String HELLO = "hello";
    public String sayGreeting() {
        return HELLO;
    }
}
