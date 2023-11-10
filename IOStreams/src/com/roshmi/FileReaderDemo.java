package com.roshmi;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("file1.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {// `~!@#%(){}[]/*&^ {} () [] <> +_
			  System.out.print((char) i);
		}
	}
}
