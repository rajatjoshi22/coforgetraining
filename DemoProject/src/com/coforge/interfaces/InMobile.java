package com.coforge.interfaces;

public abstract class InMobile implements Insurance {

	

	@Override
	public void peopleIns() {
		System.out.println("people for theft");

	}

}
class Incharge extends InMobile{
	public void vehicleIns() {
		System.out.println("change in vehicle insurance");
	}
}
