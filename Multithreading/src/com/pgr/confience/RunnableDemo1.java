package com.pgr.confience;

class ConfienceThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(100);//
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}

class PerlaReddyThread implements Runnable {

	@Override
	public void run() {// Runnable state
		for (int i = 6; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class RunnableDemo1 {

	public static void main(String[] args) {
		ConfienceThread th1 = new ConfienceThread();
		Thread confienceThread = new Thread(th1);
		confienceThread.start();
		
		Thread confienceThread1 = new Thread(th1);
		confienceThread1.setDaemon(true);
		//System.out.println(confienceThread1.isDaemon());
		confienceThread1.start();
	
		PerlaReddyThread pgth = new PerlaReddyThread();
		Thread perlaThread = new Thread(pgth);
		//System.out.println(perlaThread.isDaemon());//false

		perlaThread.start();
		

	}
}
