package guru.springproject.didemo;

import guru.springproject.didemo.controller.ConstructorInjectedController;
import guru.springproject.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestContructorInjectedController {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeAll
    public void setUp() throws Exception{
        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        constructorInjectedController = new ConstructorInjectedController(greetingService);
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
