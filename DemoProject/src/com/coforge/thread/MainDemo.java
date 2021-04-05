package com.coforge.thread;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new ChildThread("thread-1",10);
		
//		th1.start();
		Thread th2 = new ChildThread("thread-2",8);
//		
//		th2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " *5= " + (i * 5));

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		try {
			th1.join();
			th2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Work done");
	}

}
