package com.cetin.education.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Service("I18nService")
@Profile("EN")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Folks - English Service";
    }
}
