package com.ashish.greetings;

import com.ashish.sfgashishdi.repositories.EnglishGreetingRepository;

//@Service("i18nService")
//@Profile({"EN","default"})
public class i18nEngilshService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public i18nEngilshService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.sayGreetings();
    }
}
