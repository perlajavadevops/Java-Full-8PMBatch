package com.pgr.eightpm.io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("file1.txt");
		FileReader fr = new FileReader("file1.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char)i);
		}

	}

}
