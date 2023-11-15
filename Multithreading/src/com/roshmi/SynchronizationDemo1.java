package com.roshmi;

class Table {

	public static void printTable(int number) {

		synchronized (Table.class) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(number * i);
				try {
					Thread.sleep(5000);// 5*1 = 5
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}// what is the difference between synchronized method and
				// synchronized block?

		}
	}
}

class ThreadE extends Thread {

	Table table;

	public ThreadE(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		Table.printTable(5);
	}
}

class ThreadF extends Thread {

	Table table;

	public ThreadF(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		Table.printTable(100);
	}
}

public class SynchronizationDemo1 {

	public static void main(String[] args) {

		Table table = new Table();
		ThreadE threadE = new ThreadE(table);
		ThreadF threadF = new ThreadF(table);
		threadF.start();
		threadE.start();
	}
}
