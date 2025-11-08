package com.cetin.sg.springframework.sfgdi.services;


/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class PrimaryGreetingImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey Folks! - Primary";
    }
}
