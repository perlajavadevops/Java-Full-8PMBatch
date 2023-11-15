class Table {

	public synchronized static void printTable(int number) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(number * i);
			try {
				Thread.sleep(5000);//wait() ,wait(int mil),wait(int nano,
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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

public class SychronizationDemo {

	public static void main(String[] args) {
		Table table = new Table();
		ThreadE threadE = new ThreadE(table);
		ThreadF threadF = new ThreadF(table);
		threadF.start();
		threadE.start();
		
	}
}
