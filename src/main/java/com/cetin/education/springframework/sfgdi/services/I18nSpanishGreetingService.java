package com.cetin.education.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Service("I18nService")
@Profile("ES")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo -Spanish";
    }
}
