package com.coforge.langdemos;

public class Demo {
public static void main(String[] args) {
	Vehicle vehicle1=new Vehicle("Duke",25000,"KTM");
//	System.out.println(vehicle1);
	Vehicle vehicle2=new Vehicle("Apache",25000,"TVS");
//	System.out.println(vehicle2);
    Vehicle vehicle3=new Vehicle("Duke",25000,"KTM");
    System.out.println(vehicle1.equals(vehicle2));
    System.out.println(vehicle1.equals(vehicle3));
    System.out.println(vehicle2.equals(vehicle3));
    System.out.println(vehicle1.hashCode());
    System.out.println(vehicle2.hashCode());
    System.out.println(vehicle3.hashCode());
}
}
