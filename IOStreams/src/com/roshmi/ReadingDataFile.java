package com.roshmi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("manasi.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//System.out.println(fis.read());// 82
		int i = 0;
		while ((i = bis.read()) != -1) {//
			//  System.out.println(i);
			  System.out.print((char) i);
		}
	}
}
