package com.cetin.education.springframework.sfgdi.controller;

import com.cetin.education.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Controller
public class PropertyInjectedController {
    @Qualifier("propertyServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
