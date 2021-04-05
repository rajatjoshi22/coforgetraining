package com.coforge.utildemos;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {
public static void main(String[] args) {
	Set<String> hash=new LinkedHashSet<>();
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
