package com.cetin.education.springframework.sfgdi.services;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
