package com.coforge.interface2;

public interface Calculator {
	public void add(int x, int y);

	public void product(int x, int y);

	public void difference(int x, int y);

	public void divide(int x, int y);
	
	default void description() {
		System.out.println("working of calculator completed");
	}
}
