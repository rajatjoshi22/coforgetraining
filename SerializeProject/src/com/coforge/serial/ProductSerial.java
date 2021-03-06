package com.coforge.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductSerial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> productlist = new ArrayList<>();
		Product product = new Product("R8", "Audi", "car", 250000);
		productlist.add(product);
		product = new Product("TTq", "Audi", "car", 330000);
		productlist.add(product);
		product = new Product("butterflow", "Cello", "stationary", 10);
		productlist.add(product);
		product = new Product("buttergel", "Cello", "stationary", 20);
		productlist.add(product);
		product = new Product("bat", "MRF", "sports", 2500);
		productlist.add(product);

		try (FileOutputStream fs = new FileOutputStream("prod1.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			os.writeObject(productlist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
