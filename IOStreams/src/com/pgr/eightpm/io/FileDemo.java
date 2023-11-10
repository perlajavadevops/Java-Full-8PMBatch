package com.pgr.eightpm.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// File file = new File("F:\\filesio\\..\\..\\test.txt");//
		File file = new File("F:\\filesio\\a\\");//
		// file.setReadOnly();
		/*
		 * System.out.println(file.getAbsolutePath());
		 * System.out.println(file.getCanonicalPath());
		 * System.out.println(file.getPath());
		 */
		/*
		 * file.deleteOnExit();//before deleting... it will check whether the file is
		 * exist
		 * 
		 * System.out.println(file.delete());//
		 */

		String[] files = file.list();
		for (String s : files) {
			System.out.println(s);
		}
		
		/*
		 * 
		 * 
		 * if(!file.exists()) { boolean flag = file.mkdir(); System.out.println(flag); }
		 */
		/*
		 * System.out.println(file.exists());// System.out.println(file.isDirectory());
		 */

	}

}
