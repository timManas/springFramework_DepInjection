package timanas.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import timanas.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by timmanas on 2019-11-23.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}