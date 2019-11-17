package guru.springproject.didemo;

import guru.springproject.didemo.controller.SetterInjectedController;
import guru.springproject.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestSetterInjectedController {
    SetterInjectedController setterInjectedController;
    @BeforeAll
    public void setUp() throws Exception {
        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(greetingService);
    }

    @Test
    public void testSetterInjectedController() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
