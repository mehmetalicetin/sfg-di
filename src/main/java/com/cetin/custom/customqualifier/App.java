package com.cetin.custom.customqualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
    Address homeAddress = applicationContext.getBean(HomeAddress.class);
    Address officeAddress = applicationContext.getBean(OfficeAddress.class);

    System.out.println(homeAddress);
    System.out.println(officeAddress);
  }
}
