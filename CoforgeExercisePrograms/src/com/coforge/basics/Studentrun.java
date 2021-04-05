package com.coforge.basics;
import java.util.Scanner;
public class Studentrun {

public static void main(String[] args) {
	String studentname1,studentname2;
	int studentid1,studentid2;
	int[] marks1=new int[10];
	int[] marks2=new int[10];
	Scanner src=new Scanner(System.in);
	System.out.println("Enter firststudent name and id");
	studentname1=src.next();
	studentid1=src.nextInt();
	System.out.println("Enter secondstudent name and id");
	studentname2=src.next();
	studentid2=src.nextInt();
	System.out.println("Enter marks for student1");
	for(int i=0;i<marks1.length;i++)
	{
		marks1[i]=src.nextInt();
	}
	System.out.println("Enter marks for student2");
	for(int i=0;i<marks2.length;i++)
	{
		marks2[i]=src.nextInt();
	}
	Student student1=new Student(studentname1,studentid1,marks1);
	Student student2=new Student(studentname2,studentid2,marks2);
	student1.getDetails();
	student1.getGrades(marks1);
	student2.getDetails();
	student2.getGrades(marks2);
	src.close();
}
}
