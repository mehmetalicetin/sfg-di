package com.cetin.education.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Controller
public class SetterInjectedController {
    GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
       return greetingService.sayGreeting();
    }
}
