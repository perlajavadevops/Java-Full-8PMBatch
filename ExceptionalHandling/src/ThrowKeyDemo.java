import java.io.IOException;

public class ThrowKeyDemo {

	public static void m() throws IOException{

	//	String s = null;
	/*
	 * if (s.length() != 0) { System.out.println("length is " + s); } else {
	 */	
		throw new IOException();
	//	}
	}

	public static void main(String[] args) throws IOException {

		//try {
			m();
			/*
			 * }catch(Exception e) { System.out.println("handled"); }
			 */
	}
}
