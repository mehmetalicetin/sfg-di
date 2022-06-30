package com.cetin.education.springframework.sfgdi.controller;

import com.cetin.education.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-29
 */
@Controller
public class MyController{
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
