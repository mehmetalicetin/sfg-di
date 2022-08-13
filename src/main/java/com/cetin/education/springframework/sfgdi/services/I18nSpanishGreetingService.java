package com.cetin.education.springframework.sfgdi.services;


/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo -Spanish";
    }
}
