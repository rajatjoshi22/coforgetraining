package com.coforge.interfa;

public class Mobile extends Gadgets implements Insurance {

	public Mobile(String model, double price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAccessories() {
		// TODO Auto-generated method stub
   System.out.println("earphone,charger,cover" );
	}

	@Override
	public void getInsuranceDetails() {
		// TODO Auto-generated method stub
		System.out.println("Mobile insurance");

	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Discounted price :"+(price-0.5*amount));

	}

}
