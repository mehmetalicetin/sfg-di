package com.cetin.education.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-29
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Say Hello!!");
        return "Hey folks!";
    }
}
