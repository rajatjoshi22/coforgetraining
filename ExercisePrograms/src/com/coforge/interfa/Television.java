package com.coforge.interfa;

public class Television extends Gadgets {

	public Television(String model, double price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAccessories() {
		// TODO Auto-generated method stub
		System.out.println("speakers ,stand,cover");

	}

	@Override
	public void getDiscountedPrice(int amount) {
		// TODO Auto-generated method stub
		System.out.println("discounted price:" + (price - 1.5 * amount));
	}

}
