package com.cetin.education.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class PropertyServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Folks!  - Property";
    }
}
