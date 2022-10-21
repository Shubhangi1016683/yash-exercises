package com.yash.draw.model;

public class Parallelogram extends Shape
{
	double base,height;
	double areaOfPara;
	public Parallelogram() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Parallelogram(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw(double base, double height)
	{
	       this.base = base;
	      this.height = height;
	       
	        areaOfPara = base * height;
	    }
	
	 public void areaofPara()
		{
		 draw(base, height);
			System.out.format("Area of  Parallelogram is :"+areaOfPara);
			System.out.println();
		
		}

}
