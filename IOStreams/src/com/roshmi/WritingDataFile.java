package com.roshmi;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataFile {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("roshmi4.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String message = "Roshmi is learning java";
		byte[] messBytes = message.getBytes();
		
		bos.write(messBytes);
		
		System.out.println("Success");
		bos.close();
		fos.close();
		
	}
}
