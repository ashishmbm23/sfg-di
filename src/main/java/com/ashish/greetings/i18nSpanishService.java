package com.ashish.greetings;

//@Service("i18nService")
//@Profile("ES")
public class i18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Holla Munda - ES";
    }
}
