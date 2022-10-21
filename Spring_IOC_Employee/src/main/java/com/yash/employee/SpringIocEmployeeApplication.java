package com.yash.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.employee.model.Employee;

@SpringBootApplication
public class SpringIocEmployeeApplication {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp=(Employee) context.getBean("factorymethodBean");
		emp.print(); 
	}

}
