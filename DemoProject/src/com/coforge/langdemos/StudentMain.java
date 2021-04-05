package com.coforge.langdemos;

public class StudentMain {
public static void main(String[] args) {
	StudentDetails stud=new StudentDetailsImpl();
	Student1 student=new Student1("Rajat","Delhi");
	student.printDetails(stud,14,15,18,19);
	student=new Student1("Rachit","Merrut");
	student.printDetails(stud,11,45,67,89,14,15);
	
	student=new Student1("ramaswamy","banglore");
	student.printDetails(stud,11,45,67,89);
	
}
}
