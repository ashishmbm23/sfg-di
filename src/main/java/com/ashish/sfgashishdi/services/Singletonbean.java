package com.ashish.sfgashishdi.services;

import org.springframework.stereotype.Component;

@Component
public class Singletonbean {

    public Singletonbean() {
        System.out.println("I am a singleton bean");
    }

    public void getScope(){
        System.out.println("I am a singleton scope!!!!");
    }

}
