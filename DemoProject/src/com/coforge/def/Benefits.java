package com.coforge.def;

public interface Benefits {
public void customBenefits();
default void medIns() {
 System.out.println("Medical Insurance for all");	
}
static void greet() {
	System.out.println("Great day");
}
}
