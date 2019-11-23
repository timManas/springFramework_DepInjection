package timanas.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import timanas.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by timmanas on 2019-11-23.
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}