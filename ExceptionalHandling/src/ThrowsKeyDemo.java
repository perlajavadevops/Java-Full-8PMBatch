import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyDemo {

	public static void getFile() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args)/* throws FileNotFoundException */{

		//getFile();
		
		try {
			getFile();
		} catch (FileNotFoundException e) {
			// System.out.println("Exception Handled");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
