package com.coforge.inher;

public class Vehicle {
	String model;
	String brand;
	int price;

	public Vehicle(String model, String brand, int price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public void getDetails() {
		System.out.println(model + " " + brand + " " + price);
	}
	public double getDiscountedPrice(double amount) {
		return 0;
	}
}
