package com.cetin.education.springframework.sfgdi.config;

import com.cetin.education.springframework.sfgdi.repositories.EnglishGreetingServiceRepository;
import com.cetin.education.springframework.sfgdi.repositories.EnglishGreetingServiceRepositoryImpl;
import com.cetin.education.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-13
 */
@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("I18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }

    @Profile("EN")
    @Bean("I18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(){
        return new I18nEnglishGreetingService();
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
