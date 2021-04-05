package com.coforge.inher;

public class MainProduct {
public static void main(String[] args) {
	Product product=new Gadgets();
	product.getFeatures();
	product.showDiscountedPrice(12000);
	product=new Stationary();
	product.getFeatures();
	product.showDiscountedPrice(12000);
	
}
}
