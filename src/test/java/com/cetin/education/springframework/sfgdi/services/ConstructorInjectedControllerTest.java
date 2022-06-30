package com.cetin.education.springframework.sfgdi.services;

import com.cetin.education.springframework.sfgdi.controller.ConstructorInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}