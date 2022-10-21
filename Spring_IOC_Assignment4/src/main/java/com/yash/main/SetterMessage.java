package com.yash.main;

public class SetterMessage {
	private String message=null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void show()
	{
		System.out.println("Message:"+message);
	}
}
