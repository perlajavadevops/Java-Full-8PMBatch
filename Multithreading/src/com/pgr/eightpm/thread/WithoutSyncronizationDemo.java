package com.pgr.eightpm.thread;

class TableWithoutSync1 extends Thread {

	Table table;

	public TableWithoutSync1(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(10);
	}
}

class TableWithoutSync2 extends Thread {

	Table table;

	public TableWithoutSync2(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(200);
	}
}

public class WithoutSyncronizationDemo {

	public static void main(String[] args) {
		Table table = new Table();
		TableWithoutSync1 sync1 = new TableWithoutSync1(table);
		sync1.start();

		TableWithoutSync2 sync2 = new TableWithoutSync2(table);
		sync2.start();
	}
}
