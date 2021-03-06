package com.coforge.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mobile> mobilelist = new ArrayList<>();
		Mobile mobile = new Mobile("s2", "samsung", 12000.0);
		mobilelist.add(mobile);
		mobile = new Mobile("iphone4", "Apple", 22000.0);
		mobilelist.add(mobile);
		mobile = new Mobile("pixel", "google", 24000.0);
		mobilelist.add(mobile);
		mobile = new Mobile("berry1", "blackberry", 21000.0);
		mobilelist.add(mobile);
		mobile = new Mobile("y20", "vivo", 23000.0);
		mobilelist.add(mobile);
		for (Mobile mobile1 : mobilelist)
			System.out.println(mobile1);

		Collections.sort(mobilelist);
		for (Mobile mobile1 : mobilelist)
			System.out.println(mobile1);
		Comparator<Mobile> c = (Mobile o1, Mobile o2) -> {
			return o1.getModel().compareTo(o2.getModel());
		};
		Collections.sort(mobilelist, c);
		for (Mobile mobile1 : mobilelist)
			System.out.println(mobile1);
		c = (Mobile o1, Mobile o2) -> {
			return o1.getPrice().compareTo(o2.getPrice());
		};
		Collections.sort(mobilelist, c);
		for (Mobile mobile1 : mobilelist)
			System.out.println(mobile1);
	}

}
