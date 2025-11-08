package com.cetin.sg.springframework.sfgdi.config;

import com.cetin.sg.springframework.pets.PetService;
import com.cetin.sg.springframework.pets.PetServiceFactory;
import com.cetin.sg.springframework.sfgdi.datasource.FakeDataSource;
import com.cetin.sg.springframework.sfgdi.repositories.EnglishGreetingServiceRepository;
import com.cetin.sg.springframework.sfgdi.repositories.EnglishGreetingServiceRepositoryImpl;
import com.cetin.education.springframework.sfgdi.services.*;
import com.cetin.sg.springframework.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-13
 */
@Configuration
@EnableConfigurationProperties(SfgConstructorConfiguration.class)
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConstructorConfiguration sfgConstructorConfiguration){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConstructorConfiguration.getUsername());
        fakeDataSource.setPassword(sfgConstructorConfiguration.getPassword());
        fakeDataSource.setJdbcurl(sfgConstructorConfiguration.getJdbcurl());
        return fakeDataSource;
    }

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
