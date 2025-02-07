package com.cetin.education.springframework.sfgdi;

import com.cetin.education.springframework.sfgdi.config.SfgConfiguration;
import com.cetin.education.springframework.sfgdi.config.SfgConstructorConfiguration;
import com.cetin.education.springframework.sfgdi.controller.*;
import com.cetin.education.springframework.sfgdi.datasource.FakeDataSource;
import com.cetin.education.springframework.sfgdi.services.PrototypeBean;
import com.cetin.education.springframework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

//@ComponentScan(basePackages = {"com.cetin.education.springframework.pets", "com.cetin.education.springframework.sfgdi"})
//DI java configuration tarafından bean ile yonetiliyor.
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

		System.out.println("----------  Profiles --------------------------------------------");
		I18nController i18nController = context.getBean(I18nController.class);
		System.out.println(i18nController.sayHello());


		System.out.println("----------  Homework-4------------------------------------------");
		PetController petController = context.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


		System.out.println("----------  Spring Bean Scopes------------------------------------------");
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		singletonBean1.getMyScope();
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		singletonBean2.getMyScope();

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		prototypeBean1.getMyScope();
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		prototypeBean2.getMyScope();


		System.out.println("---------------------Spring Properties-------------------");

		System.out.println("-----------Fake DataSource--------------");
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(fakeDataSource.getUsername()).append(" -- ")
						.append(fakeDataSource.getPassword()).append(" -- ")
						.append(fakeDataSource.getJdbcurl());
		System.out.println(stringBuilder);


		System.out.println("-------------- Config Properties Bean ----------------");
		SfgConfiguration sfgConfiguration = context.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());


		System.out.println("-------------- Config Constructor Properties Bean ----------------");
		SfgConstructorConfiguration sfgConstructorConfiguration = context.getBean(SfgConstructorConfiguration.class);
		System.out.println(sfgConstructorConfiguration.getUsername());
		System.out.println(sfgConstructorConfiguration.getPassword());
		System.out.println(sfgConstructorConfiguration.getJdbcurl());
	}

}
