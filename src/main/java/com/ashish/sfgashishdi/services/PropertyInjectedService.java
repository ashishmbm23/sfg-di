package com.ashish.sfgashishdi.services;

import com.ashish.greetings.GreetingService;

//@Service
public class PropertyInjectedService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi Folks - property";
    }
}
