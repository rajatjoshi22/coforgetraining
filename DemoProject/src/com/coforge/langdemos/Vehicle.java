package com.coforge.langdemos;

public class Vehicle {
private String name;
private double price;
private String brand;

public Vehicle(String name, double price, String brand) {
	super();
	this.name = name;
	this.price = price;
	this.brand = brand;
}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public double getPrice() {
//	return price;
//}
//public void setPrice(double price) {
//	this.price = price;
//}
//public String getBrand() {
//	return brand;
//}
//public void setBrand(String brand) {
//	this.brand = brand;
//}
@Override
public String toString() {
	return "Vehicle [name=" + name + ", price=" + price + ", brand=" + brand + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vehicle other = (Vehicle) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
//	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//		return false;
	return true;
}

}


