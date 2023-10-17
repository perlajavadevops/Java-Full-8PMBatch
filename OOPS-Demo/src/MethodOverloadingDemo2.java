
public class MethodOverloadingDemo2 {

	public void add(int a, int b) {
		System.out.println("Addition of 2 (int a, int b) no is " + (a + b));
		add(10, 30);
		this.add((long) a, (long) b);
	}

	public void add(int a, long b) {
		System.out.println("Addition of 2 (int a, long b) no is " + (a + b));
	}

	public void add(long a, long b) {
		System.out.println("Addition of 2 (long a, long b) no is " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloadingDemo2 demo2 = new MethodOverloadingDemo2();
		demo2.add(20, 20);
		// 40
		/*
		 * demo2.add(20, 20l);//40 demo2.add(20l, 20l);//40
		 */ }

}
