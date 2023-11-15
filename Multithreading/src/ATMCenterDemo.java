class ATMCenter {

	public void queue(int n) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized(this){
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
			}
		}
			
		for (int i = 10; i <= 15; i++) {
			System.out.println(n * i);
		}
	}
}

class SBIATMThread extends Thread {

	ATMCenter atmCenter;

	public SBIATMThread(ATMCenter atmCenter) {
		this.atmCenter = atmCenter;
	}

	@Override
	public void run() {// runnable state
		atmCenter.queue(5);

	}
}

class AXISATMThread extends Thread {

	ATMCenter atmCenter;

	public AXISATMThread(ATMCenter atmCenter) {
		this.atmCenter = atmCenter;
	}

	@Override
	public void run() {// runnable state
		atmCenter.queue(7);
	}
}

public class ATMCenterDemo {

	public static void main(String[] args) throws InterruptedException {
		ATMCenter atmCenter = new ATMCenter();

		SBIATMThread sbi = new SBIATMThread(atmCenter);
		sbi.setName("SBIATMThread");
		sbi.start();
		AXISATMThread axis = new AXISATMThread(atmCenter);
		axis.setName("AXISATMThread");
		axis.start();

	}
}
