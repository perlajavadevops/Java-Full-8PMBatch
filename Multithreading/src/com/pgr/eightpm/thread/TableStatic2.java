package com.pgr.eightpm.thread;

public class TableStatic2 {

	public synchronized static void printTable(int number) {// static synchronized method

		/*synchronized (TableStatic2.class) {*/// synchronized block -- class level locking mechanisam
			for (int i = 1; i <= 5; i++) {// 5 -->
				System.out.println(number * i);// 5*1, 5*2
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		//}
	}
}
