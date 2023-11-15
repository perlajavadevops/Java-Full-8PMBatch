//Thread class and Runnable interface

class ThreadC implements Runnable{
	
	@Override
	public void run() {//Runnable State
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
	
	//Destroy state
	//Non-runnbale
}

class ThreadD implements Runnable{
	
	@Override
	public void run() {//Runnable State
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	//Destroy state
	//Non-runnbale
}
public class RunnableDemo {

	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		Thread th1 = new Thread(threadC);
		th1.start();
		
		ThreadD threadD = new ThreadD();
		Thread th2 = new Thread(threadD);
		th2.start();
	}
}
