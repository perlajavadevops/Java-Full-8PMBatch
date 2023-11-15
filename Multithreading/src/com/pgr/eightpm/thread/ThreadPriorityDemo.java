package com.pgr.eightpm.thread;

class ThreadPrio1 extends Thread{
	
	@Override
	public void run() {//runnable state sleep, join, wait
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
	}
}


class ThreadPrio2 extends Thread{
	
	@Override
	public void run() {//runnable state sleep, join, wait
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 6; i <=10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		ThreadPrio1 prio1 = new ThreadPrio1();
		prio1.setPriority(Thread.MAX_PRIORITY);
		prio1.start();
		
		ThreadPrio2 prio2 =  new ThreadPrio2();
		prio2.setPriority(9);
		prio2.start();
	}
}
