package com.coforge.predefinedinter;

import java.util.function.Consumer;

public class Check implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
       System.out.println(t.toUpperCase());
	}

}
