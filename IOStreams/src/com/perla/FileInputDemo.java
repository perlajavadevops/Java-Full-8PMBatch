package com.perla;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter message: ");
		String message = sc.nextLine();
		File file = new File("7am.txt");
		FileOutputStream fos =  new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] messBytes = message.getBytes();
		/*for (int i = 0; i < messBytes.length; i++) {
			System.out.println(messBytes[i]);
		}*/
		bos.flush();
		bos.write(messBytes);
		System.out.println("Data stored in file success...");
		bos.close();
		
	}
}
