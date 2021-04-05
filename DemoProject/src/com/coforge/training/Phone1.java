package com.coforge.training;

public class Phone1 {
	String brand;
	String model;
	int price;

	public Phone1(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println(brand + "\t" + model + "\t" + price);
	}

	public int getDiscountedPrice(int couponamt) {
		return (price - couponamt);
	}

}
