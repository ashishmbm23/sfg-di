package com.ashish.sfgashishdi.controllers;

import com.ashish.sfgashishdi.services.ConstructorInjectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorInjectedService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}