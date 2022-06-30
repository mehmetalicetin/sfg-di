package com.cetin.education.springframework.sfgdi;

import com.cetin.education.springframework.sfgdi.controller.MyController;
import com.cetin.education.springframework.sfgdi.controller.ConstructorInjectedController;
import com.cetin.education.springframework.sfgdi.controller.PropertyInjectedController;
import com.cetin.education.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
//		MyController myController = context.getBean(MyController.class);
		MyController myController = (MyController) context.getBean("myController");
		//spring context içerisinde myController'i arıyor. @Controller ile spring context içerisine dahil etmiştik.
		System.out.println(myController.sayGreeting());
		//I'm not a creating new object there, I'm asking to spring provide me object there.
		//This is fundamental tenants of Dependency Injection is to have framework doing.


		System.out.println("----------  Dependency Injection by Spring Framework  -----------");

		//Dependency Injection by Spring Framework
		//Spring is going to provide that needed object for you.

		System.out.println("----------  Property Injection ----------------------------------");
		PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());



		System.out.println("----------  Setter Injection ------------------------------------");
		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------  Constructor Injection -------------------------------");
		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
