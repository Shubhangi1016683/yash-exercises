package com.yash.springIOC;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springIOC.model.City;




public class SpringIocAssignment1Application {

	public static void main(String[] args) {
		 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		City objSCBean =(City) objAC.getBean("city");
		City objSCBean1 =(City) objAC.getBean("city1");
		 objSCBean.show();	
		 System.out.println();
		 objSCBean1.show();	
		 }

}
