package com.cetin.custom.qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.cetin.qualifier"})
public class MathApp{
  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(MathApp.class, args);
    Calculator4 calculator = applicationContext.getBean(Calculator4.class);
    System.out.println(calculator.doCalculation("sin", 1.4));
  }
}
