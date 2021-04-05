package com.coforge.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductDserial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fo = null;
		ObjectInputStream os = null;
		ArrayList<Product> dproductlist = new ArrayList<>();
		ArrayList<Product> newlist = new ArrayList<>();
		try {
			fo = new FileInputStream("prod1.ser");
			os = new ObjectInputStream(fo);
			dproductlist = (ArrayList) os.readObject();
          //	   System.out.println(dproductlist);
			for (Product pro : dproductlist)
				if ((pro.getCategory()).equals("stationary")) {
					newlist.add(pro);
				}
//			System.out.println(newlist);
			System.out.println();
			Comparator<Product> c = (Product o1, Product o2) -> {
				return o1.getBrand().compareTo(o2.getBrand());
			};
			Collections.sort(newlist, c);
			for (Product prod : newlist)
				System.out.println(prod);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fo != null || os != null) {

				try {
					os.close();
					fo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
