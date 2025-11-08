package com.cetin.sg.springframework.sfgdi.repositories;

/**
 * @Author mehmetali.cetin
 * @Date 2022-08-13
 */
public class EnglishGreetingServiceRepositoryImpl implements EnglishGreetingServiceRepository {
    @Override
    public String sayGreeting() {
        return "Hello Folks - English Service";
    }
}
