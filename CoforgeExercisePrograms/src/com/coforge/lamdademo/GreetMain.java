package com.coforge.lamdademo;

public class GreetMain {
	public static void main(String[] args) {
		Greeter greet1 = (message) -> {
			System.out.println(message + " " + "Have a good day");
		};
		Greeter greet2 = (message) -> {
			System.out.println(message + " " + "Welcome to Threads");
		};
		Greeter greet3 = (message) -> {
			System.out.println(message + " " + "Goodbye");
		};

		greet1.greetMessage("Rajat");
		greet1.greetMessage("Rohan");
		greet1.greetMessage("Virat");
		greet2.greetMessage("Rajat");
		greet2.greetMessage("Rohan");
		greet2.greetMessage("Virat");
		greet3.greetMessage("Rajat");
		greet3.greetMessage("Rohan");
		greet3.greetMessage("Virat");
	}
}
