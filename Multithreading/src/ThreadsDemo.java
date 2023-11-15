//Thread class and Runnable interface

class ThreadA extends Thread{
	
	
	@Override
	public void run() {//Runnable State
		for (int i = 0; i < 5; i++) {
			 try{
				 Thread.sleep(3000);
			 }catch(InterruptedException e){
				 e.printStackTrace();
			 }
			System.out.println(i);
		}
	}
	
	//Destroy state
	//Non-runnbale
}

class ThreadB extends Thread{
	
	@Override//
	public void run() {//Runnable State
		for (int i = 5; i < 10; i++) {
			try{
				 Thread.sleep(3000);
			 }catch(InterruptedException e){
				 e.printStackTrace();
			 }
			System.out.println(i);
		}
	}
	
	//Destroy state
	//Non-runnbale
	
	/*
	 * sleep()
	 * join()
	 * thread proirty
	 * Syncronization
	 * synchronized block
	 * synchronized method
	 * static synchronization
	 * Sample real example
	 * 
	 * IO streams
	 * 
	 * Collection Framework
	 */
}

public class ThreadsDemo {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();//new state
		//threadA.setPriority(Thread.NORM_PRIORITY);
		threadA.start();//starting state 
		
		/*try{
			threadA.join(1000);
		}catch(InterruptedException iE){
			iE.printStackTrace();
		}*/
		ThreadB threadB = new ThreadB();//new state
		//threadB.setPriority(10);
		threadB.start();//starting state 
		
		//threadB.start();//
		
		//MIN_PRIORITY=1
		//NORM_PRIORITY=5
		//MAX_PRIORITY=10
	}
}
