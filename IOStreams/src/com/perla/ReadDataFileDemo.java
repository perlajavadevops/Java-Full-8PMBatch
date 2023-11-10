package com.perla;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFileDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("7am.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//System.out.println(fis.read());
		int i = 0;
		while((i =  bis.read())!= -1) {
			System.out.print((char)i);
		}
	}
}
