package com.coforge.def;

public interface Coverage {
	public void customerBenefits();
	default void medIns() {
	 System.out.println("Medical Insurance for all");	
	}
}
