package com.ashish.sfgashishdi.controllers;

import com.ashish.sfgashishdi.services.ConstructorInjectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedService());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}