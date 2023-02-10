package com.ashish.sfgashishdi.services;

import com.ashish.greetings.GreetingService;

//@Service
public class ConstructorInjectedService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi Folks - constructor";
    }
}
