package com.roshmi;

class ThreadC implements Runnable{
	
	@Override
	public void run() {//runnable state
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class ThreadD implements Runnable{
	
	@Override
	public void run() {//runnable state
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		ThreadC threadC = new ThreadC();
		Thread th1 = new Thread(threadC);
		th1.start();
		ThreadD threadD = new ThreadD();
		Thread th2 = new Thread(threadD);
		th2.start();

		
	}
}
