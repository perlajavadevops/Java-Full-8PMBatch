import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream("D:/FilesDemo/employee5.ser");
		
		ObjectInputStream objectOut = new ObjectInputStream(fos);
		Employee emp  = (Employee) objectOut.readObject();
		
		emp.displayEmplyee();
		//System.out.println(emp.companyName);
		//System.out.println(emp.salary);
		objectOut.close();
		fos.close();
		System.out.println("De-Serialization Done");
	}
}
