package com.coforge.interfa;

public abstract class Gadgets implements Accessories {
	String model;
	double price;

	public Gadgets(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println(model + " " + price);
	}

	public abstract void getDiscountedPrice(int amount);
}
