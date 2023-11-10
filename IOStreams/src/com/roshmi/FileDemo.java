package com.roshmi;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/CoreEclipsePractice/IOStreams\\abc.txt");
		/*if(file.exists()){
			System.out.println("File is exist");
			boolean deleteFlag = file.delete();
			System.out.println(deleteFlag);
		}else{*/
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.isFile());
			/*boolean flag = file.createNewFile();
			if(flag){
				System.out.println("folder created successfully");
			}else{
				System.out.println("Folder is already exist !! ");
				System.out.println("is file created? "+flag);
			}
*/			
		//}
	}
}
