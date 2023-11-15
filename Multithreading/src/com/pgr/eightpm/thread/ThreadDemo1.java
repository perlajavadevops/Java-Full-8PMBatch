package com.pgr.eightpm.thread;

class ThreadA extends Thread{
	
	@Override
	public void run() {//runnable state sleep, join, wait
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	}
	
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();//new state
		threadA.start();
		
		
	}
}
