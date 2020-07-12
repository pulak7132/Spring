package com.pulak.springframework.n3didemo.controllers;

import com.pulak.springframework.n3didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        System.out.println("I am here");
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello("Constructor"));
    }
}