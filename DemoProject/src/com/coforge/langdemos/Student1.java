package com.coforge.langdemos;

public class Student1 {
private String name;
private String city;
public Student1(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
void printDetails(StudentDetails details,int... marks) {
	System.out.println("name :"+name+" city: "+city);
	System.out.println("Average of marks: "+details.getAverage(marks));
}
}
