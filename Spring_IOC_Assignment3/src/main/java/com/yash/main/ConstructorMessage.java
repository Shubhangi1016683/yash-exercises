package com.yash.main;

public class ConstructorMessage {
	private String message=null;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}
	
	public void show()
	{
		System.out.println("Message:"+message);
	}
}
