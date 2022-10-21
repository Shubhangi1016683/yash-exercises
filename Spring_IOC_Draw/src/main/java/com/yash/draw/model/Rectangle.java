package com.yash.draw.model;

public class Rectangle extends Shape
{
	double width, length,areaRec; //sides
     private Triangle tri;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle( double width, double length,Triangle tri) {
		super();
		this.width=width;
		this.length=length;
		this.tri = tri;
	}

	@Override
	public void draw(double x, double y)
	{
	       width = x;
	       length = y;
	   
	       areaRec =  width * length;
	    }
	 
	    public void areaofRec()
		{
	    	draw(length, width);
			System.out.format("Area of Retangle is :"+areaRec);
			tri.areaofTri();
		
		}

}
