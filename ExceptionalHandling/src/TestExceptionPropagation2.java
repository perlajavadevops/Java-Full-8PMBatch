import java.io.IOException;

public class TestExceptionPropagation2 {

	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.err.println("exception handeled:: "+e.getMessage());
			e.printStackTrace();
			//PMD Sonar Qube
			
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();

		// try {
		obj.p();
		/*
		 * } catch (IOException e) { e.printStackTrace(); }
		 */
		System.out.println("normal flow");
	}
}
