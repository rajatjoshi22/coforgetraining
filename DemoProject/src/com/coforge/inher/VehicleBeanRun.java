package com.coforge.inher;

public class VehicleBeanRun {
public static void main(String[] args) {
	VehicleBean vehicle=new VehicleBean();
	vehicle.setName("Maruti");
	vehicle.setVehicleid(12345);
	System.out.println(vehicle.getName());
	System.out.println(vehicle.getVehicleid());
}
}
