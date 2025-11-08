package com.cetin.sg.springframework.sfgdi.services;


import com.cetin.sg.springframework.sfgdi.repositories.EnglishGreetingServiceRepository;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class I18nEnglishGreetingService implements GreetingService{
    private final EnglishGreetingServiceRepository englishGreetingServiceRepository;

    public I18nEnglishGreetingService(EnglishGreetingServiceRepository englishGreetingServiceRepository) {
        this.englishGreetingServiceRepository = englishGreetingServiceRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingServiceRepository.sayGreeting();
    }
}
