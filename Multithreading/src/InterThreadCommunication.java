class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit..."+amount);
			try {
				wait(20000);
				Thread.sleep(5000);
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed..."+amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;//
		System.out.println("deposit completed... "+amount);
		notify();
	}
}

class WithdrawThread extends Thread {
	Customer c;

	public WithdrawThread(Customer customer) {
		this.c = customer;
	}

	public void run() {
		c.withdraw(20000);
	}
}

class DepositeThread extends Thread {

	Customer c;

	public DepositeThread(Customer customer) {
		this.c = customer;
	}

	public void run() {
		c.deposit(10000);
	}
}

public class InterThreadCommunication {

	public static void main(String args[]) {

		final Customer c = new Customer();
		WithdrawThread wTh = new WithdrawThread(c);
		wTh.start();

		DepositeThread dTh = new DepositeThread(c);
		dTh.start();
	}
}
