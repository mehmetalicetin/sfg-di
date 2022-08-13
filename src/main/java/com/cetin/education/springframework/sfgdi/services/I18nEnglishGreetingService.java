package com.cetin.education.springframework.sfgdi.services;


/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Folks - English Service";
    }
}
