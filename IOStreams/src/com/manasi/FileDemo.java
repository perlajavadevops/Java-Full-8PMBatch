package com.manasi;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("src");
		
		
		//System.out.println(file.isFile());//false
		//System.out.println(file.canRead());//true
		//System.out.println(file.canWrite());//true
		//System.out.println(file.isHidden());
		//file.deleteOnExit();
		/*System.out.println(file.exists());//?
		if(file.exists()){
			System.out.println("File is  exist");
			file.delete();
		}else{
			file.createNewFile();
		}*/
		
		//file.mkdir();
		//file.mkdirs();
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		/*if(file.exists()){//false
			System.out.println("File is available");
			file.delete();
		}else{
			System.out.println("File does not exist");
		}*/
		
		/*File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}*/
		
		//Serialization --> --->
		//converting java object into byteboject(bytestream)(serialization)
		//converting bytestream object into java object(De-serialization)
	}
}
