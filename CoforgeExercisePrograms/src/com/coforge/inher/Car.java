package com.coforge.inher;

public class Car extends Vehicle {
String accessor;

public Car(String model,String brand,int price,String accessor) {
	super(model,brand,price);
	this.accessor=accessor;
	
}
public void showAccessor()
{
System.out.println("Accessories are: "+accessor);	
}
public double getDiscountedPrice(double amount) {
	return (price-amount);
}
}
