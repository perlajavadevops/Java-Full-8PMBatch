package com.roshmi;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		// Data to write on Console using PrintWriter
		PrintWriter writer = new PrintWriter(System.out);//Servlets ---
		writer.write("Javatpoint provides tutorials of all technology.");
		writer.flush();
		writer.close();
		// Data to write in File using PrintWriter
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("D:\\testout.txt"));
		writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
		writer1.flush();
		writer1.close();
	}
}
