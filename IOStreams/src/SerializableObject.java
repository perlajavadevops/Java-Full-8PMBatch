import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializableObject {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\FilesDemo\\employee5.ser");
		
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,4000.5f);
		//emp2.companyName = "ABCD ";
		
		ObjectOutputStream objectOut = new ObjectOutputStream(fos);
		objectOut.writeObject(emp2);
		objectOut.close();
		fos.close();
		System.out.println("Serialization Done");
	}
}
