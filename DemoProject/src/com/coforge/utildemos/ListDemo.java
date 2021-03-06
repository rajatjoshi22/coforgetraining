package com.coforge.utildemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("c++");
		list.add("hybernet");
		System.out.println(list);

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
		}
		ListIterator<String> it = list.listIterator(3);
		while (it.hasPrevious()) {
			String str = (String) it.previous();
			System.out.println(str);
		}
	}
}
