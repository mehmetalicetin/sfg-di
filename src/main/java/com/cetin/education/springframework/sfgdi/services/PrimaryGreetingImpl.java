package com.cetin.education.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Service
@Primary
public class PrimaryGreetingImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey Folks! - Primary";
    }
}
