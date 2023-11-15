package com.pgr.eightpm.thread;

class ThreadB implements Runnable {

	@Override
	public void run() {// runnable state sleep, join, wait

		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		ThreadB threadB = new ThreadB();// new state
		
		Thread th1 = new Thread(threadB);
		th1.setName("Dhruvika");
		th1.start();
		
		th1.join(1000);
		
		Thread th2 = new Thread(threadB);
		th2.setName("Dhatrika");
		th2.start();
		
		//th2.run();

	}
}
