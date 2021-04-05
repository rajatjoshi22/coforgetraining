package com.coforge.interfa;

public class Laptop extends Gadgets implements Insurance {

	public Laptop(String model, double price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAccessories() {
		// TODO Auto-generated method stub
		System.out.println("charger,mic ,mopuse,keyboard");

	}

	@Override
	public void getInsuranceDetails() {
		// TODO Auto-generated method stub
		System.out.println("theft or damage");
	}

	@Override
	public void getDiscountedPrice(int amount) {
		// TODO Auto-generated method stub
		System.out.println("discounted price: " + (price - amount));
	}

}
