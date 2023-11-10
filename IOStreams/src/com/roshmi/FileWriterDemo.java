package com.roshmi;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:/FilesDemo/rahil3.txt");
		String s = "I/O is used to process the input and produce the output based on the input. Java uses the concept of stream to make I/O operations fast. java.io package contains all the classes required for input and output operations";
		
		fw.write(s);
		System.out.println("Hello");
		fw.close();
	}
}
