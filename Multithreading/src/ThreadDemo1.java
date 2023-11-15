class MaheshThread extends Thread{
	
	@Override
	public void run() {//runnable state
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("MaheshThread Priority is :: "+Thread.currentThread().getPriority());
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
	}
}

class PerlaThread extends Thread{//
	@Override
	public void run() {//runnable state
		//System.out.println("PerlaThread Priority is :: "+Thread.currentThread().getPriority());
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 6; i <=10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		//System.out.println("Main Thread Priority is :: "+Thread.currentThread().getPriority());

		MaheshThread mt = new MaheshThread();//new state
	//	mt.setDaemon(true);

		mt.start();// starting
		try {
			mt.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//mt.setName("Mahesh");
	//	System.out.println(mt.getName());
		System.out.println("=====================");
		//System.out.println(mt.isDaemon());
		//System.out.println(mt.getPriority());
		System.out.println("=====================");
		
		PerlaThread pt = new PerlaThread();
		pt.start();
		
		
		
		
	}
}
