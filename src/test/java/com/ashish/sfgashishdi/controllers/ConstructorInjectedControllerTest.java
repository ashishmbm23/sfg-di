package com.ashish.sfgashishdi.controllers;

import com.ashish.greetings.GreetingService;
import com.ashish.sfgashishdi.services.ConstructorInjectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller ;
    @BeforeEach
    void setUp() {
        GreetingService gs = new ConstructorInjectedService();
        controller = new ConstructorInjectedController(gs);
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}