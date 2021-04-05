package com.coforge.interfa;

public class GadgetsRun {
	public static void main(String[] args) {
		Gadgets gad = new Television("Samsung", 110000);
		gad.getDetails();
		gad.getDiscountedPrice(6000);
		Accessories acc=(Accessories)gad;
		acc.showAccessories();
		gad = new Laptop("Dell", 50000);
		gad.getDetails();
		gad.getDiscountedPrice(12000);
		Insurance ins=(Insurance) gad;
		 acc=(Accessories)gad;
		ins.getInsuranceDetails();
		acc.showAccessories();
		gad=new Mobile("Samsung",23000);
		gad.getDetails();
		gad.getDiscountedPrice(2000);
		ins=(Insurance)gad;
		acc=(Accessories)gad;
		ins.getInsuranceDetails();
		acc.showAccessories();
	}
}
