package com.coforge.inher;

public class StaticStu {
	static String trainername;
	static String companyname;
	String name;
	String laptopmodel;
	long mobile;
    static{
    	trainername="Sripriya";
    	companyname="Coforge";
    }
    static void display() {
    	System.out.println(trainername+" "+companyname);
    }
    public StaticStu(String name,String laptopmodel,long mobile) {
    	this.name=name;
    	this.mobile=mobile;
    	this.laptopmodel=laptopmodel;
    }
    void show() {
    	System.out.println(name+" "+laptopmodel+" "+mobile);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(trainername);
     System.out.println(companyname);
     companyname="congnizant";
     System.out.println(companyname);
     StaticStu student=new StaticStu("rajat","hp",923289);
     student.show();
     display();
	}

}
