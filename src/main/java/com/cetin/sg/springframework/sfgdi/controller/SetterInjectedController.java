package com.cetin.sg.springframework.sfgdi.controller;

import com.cetin.sg.springframework.sfgdi.services.GreetingService;
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
