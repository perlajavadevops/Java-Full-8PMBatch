package com.roshmi;

class ThreadA extends Thread{
	
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

class ThreadB extends Thread{
	
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
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();//New State
		//threadA.run(); Invalid Scenario
		threadA.setDaemon(true);
		threadA.start();//starting 
		System.out.println("ThreadA is daemon thread? "+threadA.isDaemon());
	//	threadA.setPriority(4);
	//	System.out.println("ThreadA Priority"+threadA.getPriority());
		/*threadA.setName("Roshmi Thread");
		System.out.println(threadA.getName());*/
		/*try {
			threadA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		ThreadB threadB = new ThreadB();//New State
		//threadB.start();//starting 
		threadB.start();// excecption
		System.out.println("ThreadB is daemon thread? "+threadB.isDaemon());
	//	threadB.setPriority(9);
	//	System.out.println("ThreadB Priority"+threadB.getPriority());
	/*	threadB.setName("Perla Thread");
		System.out.println(threadB.getName());
*/
		//threadA.dumpStack();
		//threadA = null;
		
	}
}
