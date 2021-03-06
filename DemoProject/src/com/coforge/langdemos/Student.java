package com.coforge.langdemos;

public class Student implements Cloneable {
String name,city;

public Student(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}

@Override
protected Student clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return (Student)super.clone();
}



@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + "]";
}

public static void main(String[] args) {
	Student student=new Student("Rajat","Delhi");
	System.out.println(student);
	try {
	Student student1=student.clone();
	student1.name="Rohan";
	student1.city="NewYork";
	System.out.println(student1);
	System.out.println(student.getClass()==student1.getClass());
	System.out.println(student1==student);
	}catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}
}
}
