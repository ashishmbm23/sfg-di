package com.ashish.sfgashishdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("I am a prototype bean");
    }

    public void getScope(){
        System.out.println("I am a prototype scope!!!!!!!!!!!!!");
    }
}
