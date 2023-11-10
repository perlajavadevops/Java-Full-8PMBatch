package com.pgr.eightpm.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test1.java");
		String s = "Hello, File...";
	//	fos.write(s.getBytes());

		FileWriter fw = new FileWriter("test2.txt");
		fw.write(s);
		fw.flush();
		fw.close();
	}
}
