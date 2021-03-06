package com.coforge.serial;

import java.io.Serializable;

public class Product implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String brand;
	private String category;
	private int price;

	public Product(String name, String brand, String category, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", category=" + category + ", price=" + price + "]";
	}

}
