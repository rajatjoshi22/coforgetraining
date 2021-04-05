package com.coforge.training;

public class Employee {
String name;
int eid;
double salary;
public Employee(String name,int eid,double salary) {
	this.name=name;
	this.eid=eid;
	this.salary=salary;
}
public void getDetails() {
	System.out.println(name+"\t"+eid+"\t"+salary);
}

}
