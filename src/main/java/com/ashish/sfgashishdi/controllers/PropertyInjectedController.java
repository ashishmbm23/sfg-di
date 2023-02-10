package com.ashish.sfgashishdi.controllers;

import com.ashish.greetings.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedService")
    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
