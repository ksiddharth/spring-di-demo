package guru.springproject.didemo;

import guru.springproject.didemo.controller.PropertyInjectedController;
import guru.springproject.didemo.service.GreetingServiceImpl;
import guru.springproject.didemo.service.GreetingServiceInterface;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestPropertyInjectedController {
    PropertyInjectedController propertyInjectedController;
    @BeforeAll
    public void setUp() throws Exception {
        propertyInjectedController = new PropertyInjectedController();
    }

    @Test
    public void test() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
