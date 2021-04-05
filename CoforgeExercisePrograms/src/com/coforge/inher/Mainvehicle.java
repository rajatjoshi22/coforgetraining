package com.coforge.inher;

import java.util.Scanner;

public class Mainvehicle {
	public static void main(String[] args) {
		String choice;
		double discountedPrice;
		System.out.println("Enter your choice");
		Scanner src = new Scanner(System.in);
		choice = src.next();
		switch (choice) {
		case "Car":
			Vehicle car = new Car("baleno", "maruti", 700000, "Air Conditioner");
			Car car2 = (Car) car;
			car.getDetails();
			car2.showAccessor();
			discountedPrice = car.getDiscountedPrice(12000);
			System.out.println("Discounted price for car: " + discountedPrice);
			break;
		case "Bike":
			Vehicle bike = new Bike("duke", "KTM", 250000, 17.5);
			Bike bike2 = (Bike) bike;
			bike.getDetails();
			bike2.showMileage();
			discountedPrice = bike.getDiscountedPrice(12000);
			System.out.println("Discounted price for Bike: " + discountedPrice);
			break;
		default:
			System.out.println("Wrong Input");
		}
		src.close();
	}
}