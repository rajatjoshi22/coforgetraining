package com.coforge.inher;

public class Product {
	void greetMessage() {
		System.out.println("Welcome to shop");
	}
public void getFeatures() {
	System.out.println("Product Features");
}
void showDiscountedPrice(int amount) {
	System.out.println("Discount :"+amount*2);
}
}
class Stationary extends Product{
	@Override
	public void getFeatures() {
		System.out.println("Stationary Features");
	}
	@Override
	public void showDiscountedPrice(int amount)
	{
		System.out.println("Discount: "+amount);
	}
}
class Gadgets extends Product{
	
	public void getFeatures() {
		System.out.println("Gadgets Features");
	}
	void showDiscountedPrice(int amount)
	{
		System.out.println("Discount: "+(amount-200));
	}
}