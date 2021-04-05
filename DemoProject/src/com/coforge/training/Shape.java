package com.coforge.training;

public class Shape {
 void calArea(int x)
 {
	 System.out.println("Square"+(x*x));
 }
 double calArea(double x) {
	 return (Math.PI*x*x);
 }
 int calArea(int length,int breadth)
 {
	 return (length*breadth);
 }
 double calArea(int base,double heigth)
 {
	 return (0.5*base*heigth);
 }
}
