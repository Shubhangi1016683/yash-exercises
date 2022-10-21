package com.yash.draw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.draw.model.Rectangle;

public class SpringIocDrawApplication {

	public static void main(String[] args) {
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Rectangle rect =(Rectangle) objAC.getBean("rectangleBean");
		System.out.println();
		rect.areaofRec();
	}

}
