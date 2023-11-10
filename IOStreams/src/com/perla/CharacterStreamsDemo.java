package com.perla;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamsDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter message: ");
		String message = sc.nextLine();
		
		//FileOutputStream fos =  new FileOutputStream("7am.txt");
		
		FileWriter fw = new FileWriter("7am_1.html");
		fw.write(message);
		
		fw.close();
		sc.close();
		
		/*FileReader fr = new FileReader("7am_1.pdf");
		int i =0;
		while((i=fr.read())!=-1){//0 index: -1
			System.out.print((char)i);
		}*/
	
		//File, Serialization
	}
}
