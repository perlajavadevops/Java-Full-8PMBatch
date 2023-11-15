package com.karnav;

class KarnavThread extends Thread{
	@Override
	public void run() {
		
		System.out.println("Current Thread(KarnavThread) is ? "+Thread.currentThread());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {//0-4
			System.out.println(i);
		}
	}
}

class RahilThread extends Thread{
	@Override
	public void run() {
		System.out.println("Current Thread(RahilThread) is ? "+Thread.currentThread());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 5; i < 10; i++) {//0-4
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		KarnavThread kth = new KarnavThread();//new state
		RahilThread rth = new RahilThread();
		kth.start();//runnable state
		kth.setDaemon(true);

		//kth.setName("Karnav Thread");
		//System.out.println(kth.getName());
		System.out.println(kth.getPriority());
		System.out.println(kth.isDaemon());
		//kth.join();
		rth.start();
		System.out.println(rth.isDaemon());

		//rth.setName("Rahil Thread");
		//rth.setPriority(Thread.MAX_PRIORITY);
		//System.out.println(rth.getPriority());
		//System.out.println(rth.getName());


		
	}
}
