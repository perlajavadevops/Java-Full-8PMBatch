package com.manasi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("D:\\FilesDemo/karnav.txt");
	//	BufferedInputStream bis = new BufferedInputStream(fis);
		//System.out.println(fis.read());
		
		int i =0;
		while((i=fis.read())!=-1){//0 index: -1
			System.out.print((char)i);
		}
	
	}
}
