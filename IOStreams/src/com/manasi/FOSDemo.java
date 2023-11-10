package com.manasi;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) throws IOException{
	
		FileOutputStream fos = new FileOutputStream("D:/FilesDemo/karnav1.txt");// /
		FileOutputStream fos1 = new FileOutputStream("D:/FilesDemo/rahil1.txt");// /

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ByteArrayOutputStream barryO1 = new ByteArrayOutputStream();
		
		
		String s ="Hello Karnav Good Morning xvczv";
		byte[] byArry = s.getBytes();
		//fos.write(byArry);
		barryO1.write(byArry);
		barryO1.flush();//flush the data into stream
		//bos.close();
		
		barryO1.writeTo(bos);
		barryO1.writeTo(bos);
		barryO1.close();//closing stream 
		fos.close();
		fos1.close();
		
		
	
	}
	
}
