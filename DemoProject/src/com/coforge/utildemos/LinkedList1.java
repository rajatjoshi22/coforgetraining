package com.coforge.utildemos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("java");
		list.add("python");
		list.add("c++");
		list.add("hybernet");
		System.out.println(list);
		list.set(3,"Angular");
		list.add(3,"lucky");
        Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str
					
					
					
					
					);
		}
//		ListIterator<String> it = list.listIterator(3);
//		while (it.hasPrevious()) {
//			String str = (String) it.previous();
//			System.out.println(str);
//		}
	}
}
