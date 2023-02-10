package com.ashish.sfgashishdi.services;

import com.ashish.greetings.GreetingService;

//@Service
//@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi From Primary bean";
    }
}
