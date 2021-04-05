package com.coforge.training;

public class Mobilerun {
	public static void main(String[] args) {
		int couponamt = 2000;
		int newPrice;
		Phone1 mobile1 = new Phone1("Samsung", "Galaxy200", 25000);

		mobile1.getDetails();
		newPrice = mobile1.getDiscountedPrice(couponamt);
		System.out.println("new price:" + newPrice);
		Phone1 mobile2 = new Phone1("Apple", "Iphone12", 125000);

		mobile2.getDetails();

		newPrice = mobile2.getDiscountedPrice(couponamt);
		System.out.println("new price:" + newPrice);

	}

}
