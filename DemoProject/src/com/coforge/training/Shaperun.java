package com.coforge.training;

public class Shaperun {
public static void main(String[] args) {
	Shape Area=new Shape();
	Area.calArea(5);
	int rectangle=Area.calArea(2,6);
	System.out.println("Area of rectangle: "+rectangle);
	double triangle=Area.calArea(2, 15.0);
	System.out.println("Area of Triangle "+triangle);
	double circle=Area.calArea(3.0);
	System.out.println("Area of circle is : "+circle);
	
}
}
