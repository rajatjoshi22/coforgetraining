package com.coforge.utildemos;

import java.util.ArrayList;

public class CustDemo {
public static void main(String[] args) {
	String city="Delhi";
	
	ArrayList<Customer> list=new ArrayList<>();
	ArrayList<String> list1=new ArrayList<>();
	Customer cust1=new Customer(123,"Rajat","Delhi");
	Customer cust2=new Customer(345,"Raj","Delhi");
	Customer cust3=new Customer(567,"Rajshri","Delhi");
	Customer cust4=new Customer(789,"Rajit","Chennai");
	Customer cust5=new Customer(901,"Rajesh","merrut");
	Customer cust6=new Customer(113,"Raju","noida");
	list.add(cust1);
	list.add(cust2);
	list.add(cust3);
	list.add(cust4);
	list.add(cust5);
	list.add(cust6);
   for(Customer cus:list) {
	System.out.println(cus);
    if(cus.getCity()=="Delhi")
    {
    	list1.add(cus.getName());
    }
     }
   for(String nam:list1) {
	   System.out.println(nam);
   }
}
}
