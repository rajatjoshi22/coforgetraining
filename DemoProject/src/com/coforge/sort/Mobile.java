package com.coforge.sort;

public class Mobile implements Comparable<Mobile> {
private String model;
private String brand;
private Double price;
public Mobile(String model, String brand, Double price) {
	super();
	this.model = model;
	this.brand = brand;
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + "]";
}

@Override
public int compareTo(Mobile o) {
	// TODO Auto-generated method stub
	return this.getBrand().compareTo(o.getBrand());
}

}
