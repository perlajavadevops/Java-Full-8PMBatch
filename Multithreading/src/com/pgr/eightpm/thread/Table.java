package com.pgr.eightpm.thread;

public class Table {

	public /* synchronized */ void printTable(int number) {//synchronized method

		synchronized (this) {//synchronized block -- object level locking mechanisam
			for (int i = 1; i <= 5; i++) {// 5 -->
				System.out.println(number * i);// 5*1, 5*2
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
