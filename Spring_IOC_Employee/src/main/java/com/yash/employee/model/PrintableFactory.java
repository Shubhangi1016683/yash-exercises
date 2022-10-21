package com.yash.employee.model;

public class PrintableFactory {

	public static Employee getEmployee()
	{
		return new Clerk();
	}
}
