
public class ControllStatementsDemo {

	public static void main(String[] args) {
		int a = 1;

		if (a < 4) {
			System.out.println("Yes a value less than 4");
		} else if (a < 10) {
			System.out.println("Yes a value less than 10");
		} else {
			System.out.println("No a value not less than 10");

		}

		// SUnday, Monday, Friday,.....

		switch (a) {
		case 10:
			System.out.println("Yes, a value is " + a);
		case 20:
			System.out.println("Yes, a value is " + a);
		default:
			System.out.println("a values " + a);
		}
	}
}
