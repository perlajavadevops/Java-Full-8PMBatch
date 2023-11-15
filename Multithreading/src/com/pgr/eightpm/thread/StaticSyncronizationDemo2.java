package com.pgr.eightpm.thread;

class TableStaticSync1 extends Thread {

	@Override
	public void run() {
		TableStatic2.printTable(10);
	}
}

class TableStaticSync2 extends Thread {

	@Override
	public void run() {
		TableStatic2.printTable(200);
	}
}

public class StaticSyncronizationDemo2 {

	public static void main(String[] args) {
		TableStaticSync1 sync1 = new TableStaticSync1();
		sync1.start();

		TableStaticSync2 sync2 = new TableStaticSync2();
		sync2.start();
	}
}
