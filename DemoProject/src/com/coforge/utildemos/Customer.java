package com.coforge.utildemos;

public class Customer {
private int customerid;
private String name,city;
public Customer(int customerid, String name, String city) {
	super();
	this.customerid = customerid;
	this.name = name;
	this.city = city;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", name=" + name + ", city=" + city + "]";
}


}
