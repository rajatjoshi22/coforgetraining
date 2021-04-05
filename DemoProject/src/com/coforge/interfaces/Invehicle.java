package com.coforge.interfaces;

public class Invehicle implements Insurance {
String name;
double price;
@Override
public void vehicleIns() {
	// TODO Auto-generated method stub
	System.out.println("For bike insurance");
}
@Override
public void peopleIns() {
	// TODO Auto-generated method stub
	System.out.println("For health insurance");
}

}
