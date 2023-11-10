package com.pgr.eightpm.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("file1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i = 0;
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}

		fis.close();
		bis.close();
	}
}
