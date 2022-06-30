package com.cetin.education.springframework.sfgdi.services;

import org.springframework.stereotype.Controller;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
