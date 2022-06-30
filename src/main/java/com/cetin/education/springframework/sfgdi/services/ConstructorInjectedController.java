package com.cetin.education.springframework.sfgdi.services;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
