package com.coforge.utildemos;


import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	Set<String> hash=new TreeSet<>();
	hash.add("Ram");
	hash.add("shyam");
	hash.add("jack");
	hash.add("danials");
	System.out.println("Ram".hashCode());
	System.out.println("shyam".hashCode());
	System.out.println("jack".hashCode());
	System.out.println("danials".hashCode());
	Iterator<String> i = hash.iterator();
	while (i.hasNext()) {
		String str = i.next();
		System.out.println(str);
}
}
}
