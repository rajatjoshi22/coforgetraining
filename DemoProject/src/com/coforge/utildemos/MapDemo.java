package com.coforge.utildemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
//	Map<Integer,String> hashmap=new LinkedHashMap<>();
	Map<Integer,String> hashmap=new TreeMap<>();
	hashmap.put(1, "jonny");
	hashmap.put(2, "rajat");
	hashmap.put(3, "monty");
	System.out.println(hashmap);
	System.out.println(hashmap.containsKey(1));
	System.out.println(hashmap.get(1));
	
	Set<Integer> key=hashmap.keySet();
	for(Integer val:key)
		System.out.println(hashmap.get(val));
}
}
