
public class StaticPolymorphismDemo {

	public static void add(int a, long b) {
		System.out.println("Addition of 2 (int a, long b) no is " + (a + b));
	}

	public static void add(long a, int b) {
		System.out.println("Addition of 2 (long a, int b) no is " + (a + b));
	}

	private static void add1(long a, int b) {
		System.out.println("Addition of 2 (long a, int b) no is " + (a + b));
	}
	public static void main(String[] args) {

		StaticPolymorphismDemo.add(10L, 10);//privates methods, method overloading
		StaticPolymorphismDemo.add1(10,10);
	}
}

class Demo1 {
	public static void main(String[] args) {
		StaticPolymorphismDemo.add(10L, 10);//privates methods, method overloading
		//StaticPolymorphismDemo.add1(10,10);
	}
}
