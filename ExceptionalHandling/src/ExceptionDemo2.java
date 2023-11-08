import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo2 {

	public static void m() {
		// try block
		FileInputStream file = null;// IO Stream
		try {
			file = new FileInputStream("abc.txt");//
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block will execute always");
			try {
				//System.out.println(file);
				if(file!=null) {
					file.close();// try
					file = null;
					
					System.gc();
				}
			} catch (IOException ioEx) {
				ioEx.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		m();
	}
}
