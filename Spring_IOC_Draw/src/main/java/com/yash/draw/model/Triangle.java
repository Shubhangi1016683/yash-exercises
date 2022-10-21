package com.yash.draw.model;

public class Triangle  extends Shape
{
	double weight,height,areaOfTriangle;
	private Parallelogram para;
	
	
		public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

		
		public Triangle( double weight,double height,Parallelogram para) {
			super();
			this.height=height;
			this.weight=weight;
			this.para = para;
		}


		@Override
		public void draw(double x, double y) {
			// TODO Auto-generated method stub
			
			areaOfTriangle = (x*y)/2; 
			
		}
		 public void areaofTri()
			{
			 draw( weight,height);
			 System.out.println();
				System.out.format("Area of Triangle is :"+areaOfTriangle);
				System.out.println();
				para.areaofPara();
			
			}


}
