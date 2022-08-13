package com.cetin.education.springframework.sfgdi.config;

import com.cetin.education.springframework.sfgdi.services.ConstructorServiceImpl;
import com.cetin.education.springframework.sfgdi.services.PropertyServiceImpl;
import com.cetin.education.springframework.sfgdi.services.SetterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-13
 */
@Configuration
public class GreetingServiceConfig {

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
