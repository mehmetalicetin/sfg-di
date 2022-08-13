package com.cetin.education.springframework.sfgdi.config;

import com.cetin.education.springframework.pets.CatPetService;
import com.cetin.education.springframework.pets.DogPetService;
import com.cetin.education.springframework.pets.PetService;
import com.cetin.education.springframework.pets.PetServiceFactory;
import com.cetin.education.springframework.sfgdi.repositories.EnglishGreetingServiceRepository;
import com.cetin.education.springframework.sfgdi.repositories.EnglishGreetingServiceRepositoryImpl;
import com.cetin.education.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-13
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog","default"})
    @Bean("petservice")
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean("petservice")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"ES"})
    @Bean("I18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingServiceRepository englishGreetingServiceRepository(){
        return new EnglishGreetingServiceRepositoryImpl();
    }

    @Profile({"EN", "default"})
    @Bean("I18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingServiceRepository englishGreetingServiceRepository){
        return new I18nEnglishGreetingService(englishGreetingServiceRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingImpl primaryGreetingImpl(){
        return new PrimaryGreetingImpl();
    }

    @Bean
    ConstructorServiceImpl constructorServiceImpl() {
        return new ConstructorServiceImpl();
    }

    @Bean
    PropertyServiceImpl propertyServiceImpl() {
        return new PropertyServiceImpl();
    }

    @Bean
    SetterServiceImpl setterServiceImpl() {
        return new SetterServiceImpl();
    }

}
