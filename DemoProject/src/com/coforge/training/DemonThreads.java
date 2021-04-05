package com.coforge.training;
class ChildThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			String tname=Thread.currentThread().getName();
			System.out.println(tname  +i);
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class DemonThreads {
public static void main(String[] args) {
	Thread t=new ChildThread();
	t.setName("child");
	t.setDaemon(true);
	t.start();
	for(int i=0;i<5;i++) {
		
		System.out.println("main" +i);
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}
