package com.coforge.inher;

public class Bike extends Vehicle{
	double mileage;
	
	public Bike(String model,String brand,int price,double mileage) {
		super(model,brand,price);
		this.mileage=mileage;
	}
public void showMileage() {
	System.out.println("Mileage of bike is : "+mileage);
}
public double getDiscountedPrice(double amount) {
	return (price-(amount+500));
}
}
