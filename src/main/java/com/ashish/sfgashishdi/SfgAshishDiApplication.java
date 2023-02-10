package com.ashish.sfgashishdi;

import com.ashish.config.SfgConfig;
import com.ashish.datasource.FakeDataSource;
import com.ashish.sfgashishdi.controllers.*;
import com.ashish.sfgashishdi.services.PrototypeBean;
import com.ashish.sfgashishdi.services.Singletonbean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ashish.sfgashishdi", "com.ashish.greetings","com.ashish.config","com.ashish.pets"})
@SpringBootApplication
public class SfgAshishDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgAshishDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        String greeting = myController.greeting();
        System.out.println(greeting);

        System.out.println("----Property-----");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayGreeting());

        System.out.println("=======Setter=======");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayGreeting());

        System.out.println("=======Constructor=======");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayGreeting());

        System.out.println("========i18nController=====");
        i18nController icontroller = (i18nController) context.getBean("i18nController");
        System.out.println(icontroller.sayHello());

        System.out.println("==========Pet Controller==========");

        PetController petController = context.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());


        System.out.println("-----------------Scope----------------------");

        Singletonbean singletonbean1 = context.getBean(Singletonbean.class);
        singletonbean1.getScope();
        Singletonbean singletonbean2 = context.getBean(Singletonbean.class);
        singletonbean2.getScope();

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        prototypeBean1.getScope();
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        prototypeBean2.getScope();

        System.out.println("================FakeDataSource===============");
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcUrl());

        System.out.println("---------------------SFGConfig-----------------");
        SfgConfig sfgConfig = context.getBean(SfgConfig.class);
        System.out.println(sfgConfig.getUsername());
        System.out.println(sfgConfig.getPassword());
        System.out.println(sfgConfig.getJdbcUrl());

        /*System.out.println("---------------------SFGConsdtrucotrConfig-----------------");
        SfgConstructorConfig sfgConstructorConfig = context.getBean(SfgConstructorConfig.class);
        System.out.println(sfgConstructorConfig.getUsername());
        System.out.println(sfgConstructorConfig.getPassword());
        System.out.println(sfgConstructorConfig.getJdbcUrl());*/
    }

}
