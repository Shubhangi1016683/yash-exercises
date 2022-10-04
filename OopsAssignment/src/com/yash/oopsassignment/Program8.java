package com.yash.oopsassignment;

public class Program8 {

	@Override
	protected void finalize() {
		System.out.println("Finalize called");
	
	}
	public static void main(String[] args) {
		Program8 obj = new Program8();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	            
	        System.gc();   
	        System.out.println("end of garbage collection");   
	}

}
