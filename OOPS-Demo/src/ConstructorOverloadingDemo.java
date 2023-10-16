
public class ConstructorOverloadingDemo {
	
	
	/*
	 * public ConstructorOverloadingDemo() {
	 * System.out.println("0-arg constructor"); }
	 * 
	 * public ConstructorOverloadingDemo(int a) {
	 * System.out.println("1-arg constructor"); }
	 */

	/*
	 * public ConstructorOverloadingDemo(long a) {
	 * System.out.println("1-arg constructor"); }
	 */
	
	public ConstructorOverloadingDemo(int a, long b) {
		System.out.println("2-arg (int, long) constructor");
	}
	
	public ConstructorOverloadingDemo(long a, int b) {
		System.out.println("2-arg  (long, int) constructor");
	}
	
	public static void main(String[] args) {
		//ConstructorOverloadingDemo demo1 =  new ConstructorOverloadingDemo();//0-arg constructor
		//ConstructorOverloadingDemo demo2 =  new ConstructorOverloadingDemo(10);//0-arg constructor
	
		ConstructorOverloadingDemo demo1 = new ConstructorOverloadingDemo(10L, 10);
		
		
	}
}
