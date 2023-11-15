package com.pgr.confience;

class ThreadA extends Thread{
	
	@Override
	public void run() {//Non-Runnable for particualer time period - 50
		System.out.println(Thread.currentThread());
		
		try {
			Thread.sleep(10000);//
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <=5 ; i++) {
			System.out.println(i);
		}
	}
}

class ThreadB extends Thread{
	
	@Override
	public void run() {//Runnable state
		for (int i = 6; i <=10 ; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ThreadA threadA = new ThreadA();//new state
		threadA.start();//twice
		//threadA.setPriority(Thread.NORM_PRIORITY);
		//threadA.start();
		System.out.println("========================");
		try {
			threadA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ThreadA threadA1 = new ThreadA();
	//	threadA1.setName("Confience-1");
		threadA1.start();

		ThreadB threadB = new ThreadB();//
		threadB.start();
		//threadB.run();//will run within the main thread 
		//Terminated
	}
}
