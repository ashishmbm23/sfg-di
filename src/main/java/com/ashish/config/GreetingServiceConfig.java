package com.ashish.config;

import com.ashish.datasource.FakeDataSource;
import com.ashish.greetings.i18nEngilshService;
import com.ashish.greetings.i18nSpanishService;
import com.ashish.pets.PetService;
import com.ashish.pets.PetServiceFactory;
import com.ashish.sfgashishdi.repositories.EnglishGreetingRepository;
import com.ashish.sfgashishdi.repositories.EnglishGreetingRepositoryImpl;
import com.ashish.sfgashishdi.services.ConstructorInjectedService;
import com.ashish.sfgashishdi.services.PrimaryGreetingService;
import com.ashish.sfgashishdi.services.PropertyInjectedService;
import com.ashish.sfgashishdi.services.SetterInjectedService;
import org.springframework.context.annotation.*;

//@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
@PropertySource("classpath:datasource.properties")
public class GreetingServiceConfig {

    //Factory bean

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean("pet")
    @Profile({"dog","default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean("pet")
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    ConstructorInjectedService constructorInjectedService(){
        return new ConstructorInjectedService();
    }
    @Bean
    PropertyInjectedService propertyInjectedService(){
        return new PropertyInjectedService();
    }
    @Bean
    SetterInjectedService setterInjectedService(){
        return new SetterInjectedService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"EN","default"})
    @Bean
    i18nEngilshService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new i18nEngilshService(englishGreetingRepository);
    }

    @Profile("ES")
    @Bean("i18nService")
    i18nSpanishService i18nSpanishService(){
        return new i18nSpanishService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    //datasource config
    /*@Bean
    FakeDataSource fakeDataSource(@Value("${app.username}") String username,
                                  @Value("${app.password}") String password,
                                  @Value("${app.jdbcUrl}") String jdbcUrl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcUrl);
        return fakeDataSource;
    }*/

    @Bean
    FakeDataSource fakeDataSource(SfgConfig sfgConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfig.getUsername());
        fakeDataSource.setPassword(sfgConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgConfig.getJdbcUrl());
        return fakeDataSource;
    }
}
