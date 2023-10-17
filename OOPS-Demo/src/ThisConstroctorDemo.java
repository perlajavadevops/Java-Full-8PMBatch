
public class ThisConstroctorDemo {

	ThisConstroctorDemo() {
		this(10);
		System.out.println("0-arg cons");
	}

	ThisConstroctorDemo(int a) {
		this(10, 10);
		System.out.println("1-arg cons");
	}

	ThisConstroctorDemo(int a, int b) {
		System.out.println("2-arg cons");
	}

	public static void main(String[] args) {
		ThisConstroctorDemo demo = new ThisConstroctorDemo();
		
	}
}
