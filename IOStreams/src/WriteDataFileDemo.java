import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteDataFileDemo {

	public void writeData(String data) throws IOException {
		File file = new File("D:/IOStreams/confience3.txt");
		if(file.exists()){
			System.out.println("In if condition");
			FileOutputStream fos = new FileOutputStream(file);
			
			//byte[] arr = data.getBytes();// Convert string to byte array ['C','d']//67
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			bos.write(data.getBytes());
			bos.flush();
			System.out.println("Done...");
			fos.close();//close stream

		}else{
			System.out.println("In else condition");

			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			
			//byte[] arr = data.getBytes();// Convert string to byte array ['C','d']//67
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			bos.write(data.getBytes());
			bos.flush();
			System.out.println("Done...");
			fos.close();//close stream
		}

	}

	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream("D:/IOStreams/confience1.txt");//FileNotFoundException
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int i = 0;
		/*int j = fis.read();
		System.out.println((char)j);*/
		while ((i = bis.read()) != -1) {//
			//System.out.println(i);
			System.out.print((char) i);
		}
		// System.out.println("Done...");
	}

	public static void main(String[] args) throws IOException {
		WriteDataFileDemo demo = new WriteDataFileDemo();
		 demo.writeData("Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, \n you must use escape sequences.Character combinations consisting \n of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.Character combinations consisting of a backslash followed by a letter or by a combination of digits are called escape sequences. To represent a newline character, single quotation mark, or certain other characters in a character constant, you must use escape sequences.");
		//demo.readData();
	}
}
