package com.coforge.threads;

public class QueryRun {
	public static void main(String[] args) {
		System.out.println("In main");
		Trainer trainer = new Trainer();
		Student student1 = new Student("Rajat", "this is Rajat's question", trainer);
		Student student2 = new Student("Rohan", "this is Rohan's question", trainer);
		Student student3 = new Student("Raj", "this is Raj's question", trainer);
	}
}
