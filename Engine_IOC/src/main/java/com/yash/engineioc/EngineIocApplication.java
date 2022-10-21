package com.yash.engineioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.engineioc.model.Vehicle;



public class EngineIocApplication {

	public static void main(String[] args) {
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Vehicle vehicle =(Vehicle) objAC.getBean("vehicle");
		
		vehicle.show();	
		 System.out.println();
		
	}

}
