import java.io.File;
import java.io.IOException;


public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/IOStreams/Demo/newFile.txt");
		//file.mkdir();
		
		//System.out.println(file.getCanonicalPath());
		//System.out.println(file.isHidden());
		System.out.println(file.getTotalSpace());
		//file.createNewFile();
		
		/*if(file.exists()){
			System.out.println(file.delete());
		}else{
			System.out.println("Not deleted");
		}*/
	}
}
