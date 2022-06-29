package com.cetin.education.springframework.sfgdi;

import com.cetin.education.springframework.sfgdi.controller.MyController;
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
		String greetings   = myController.sayHello();
		System.out.println(greetings);
		//I'm not a creating new object there, I'm asking to spring provide me object there.
		//This is fundamental tenants of Dependency Injection is to have framework doing.
	}

}
