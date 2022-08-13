package com.cetin.education.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class ConstructorServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Folks!  - Constructor";
    }
}
