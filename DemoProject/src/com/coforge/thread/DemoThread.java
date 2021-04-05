package com.coforge.thread;

public class DemoThread {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		System.out.println(i+" *5= "+(i*5));
	
	try {
	Thread t=Thread.currentThread();
//	System.out.println(t);
//	t.setName("DemoThread");
//	System.out.println(t);
//	int x=10/0;
//	System.out.println(x);
	Thread.sleep(2000);
	}catch(InterruptedException e) {
        e.printStackTrace();		
	}
}
}
}