package com.yash.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocAssignment3Application {

	public static void main(String[] args) {
		ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        ConstructorMessage constMessage=(ConstructorMessage) objAC.getBean("constructorMessage");
        constMessage.show();
	}

}
