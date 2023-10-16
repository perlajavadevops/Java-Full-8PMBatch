
public class MethodOverloadingDemoByChangingDataType {

	// addition of the numbers.

	public static void add(int a, int b) {
		System.out.println("Addition of 2 (int a, int b) no is " + (a + b));
	}

	public static long add(int a, long b) {
		System.out.println("Addition of 2 (int a, long b) no is " + (a + b));
		return a+b;
	}

	public static float add(long a, long b) {
		System.out.println("Addition of 2 (long a, long b) no is " + (a + b));
		return a+b;
	}

	public static void add(long a, int b) {
		System.out.println("Addition of 2 (long a, int b) no is " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println("Addition of 3 no is " + (a + b + c));
	}

	public static void add(double a, double b, double c) {
		System.out.println("Addition of 3 no is " + (a + b + c));
	}

	public static void main(String[] args) {
		add(10, 10);// (int, int) A
		add(10, 10L);// (int, long) B
		add(10L, 10);// (long, int) C
		add(10l, 10l);// (long, long) D
	}
}
