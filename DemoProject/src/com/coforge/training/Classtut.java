package com.coforge.training;



public class Classtut {
	String name;
	int eid;
	double salary;
	
	public void getDetails()
	{
		System.out.println("name"+name);
		System.out.println("eid"+eid);
		System.out.println("salary"+salary);
	}
	public String greet(String msg)
	{
		return msg+name;
	}
	public static void main(String[] args) {
		String message;
		Classtut emp=new Classtut();
		emp.name="rajat";
		emp.eid=12345;
		emp.salary=12000;
		emp.getDetails();
	    message=emp.greet("Good Afternoon ");
	    System.out.println(message);
		Classtut emp2=new Classtut();
		emp2.name="joshi";
		emp2.eid=123478;
		emp2.salary=450000;
		emp2.getDetails();
		message=emp2.greet("Very good Afternoon");
		System.out.println(message);
		Classtut emp3;
		emp3=emp2;
		emp3.getDetails();
		message=emp3.greet("very very Good Afternoon");
		System.out.println(message);
		System.out.println(emp.name+""+emp.eid+""+emp.salary);
		System.out.println(emp2.name+""+emp2.eid+""+emp2.salary);
		emp3.name="rohan";
		System.out.println(emp3.name+""+emp3.eid+""+emp3.salary);
		System.out.println(emp2.name+""+emp2.eid+""+emp2.salary);
		
	}

}
