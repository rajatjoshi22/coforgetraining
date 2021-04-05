package com.coforge.training;

public class Phone {
	String brand;
	String model;
	int price;

	public static void main(String[] args) {
		Phone mob1 = new Phone();
		mob1.brand = "samsung";
		mob1.model = "galaxys1";
		mob1.price = 25000;
		Phone mob2 = new Phone();
		mob2.brand = "Apple";
		mob2.model = "iphone12";
		mob2.price = 125000;
		System.out.println(mob1.brand + " " + mob1.model + " " + mob1.price);
		System.out.println(mob2.brand + " " + mob2.model + " " + mob2.price);

	}
}
