package com.perla;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\GangiReddy\\Training");// \\
		
		String[] s = file.list();
		
		for(String see : s) {
			System.out.println(see);
		}
		System.out.println(s.length);
		
		//System.out.println(file.exists());
		//file.deleteOnExit();
		
//		/System.out.println(file.dele));
		/*if(file.exists()) {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			//System.out.println(fis.read());
			int i = 0;
			while((i =  bis.read())!= -1) {
				System.out.print((char)i);
			}
			
			file.deleteOnExit();
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter message: ");
			String message = sc.nextLine();
			FileOutputStream fos =  new FileOutputStream(file);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] messBytes = message.getBytes();
			for (int i = 0; i < messBytes.length; i++) {
				System.out.println(messBytes[i]);
			}
			bos.flush();
			bos.write(messBytes);
			System.out.println("Data stored in file success...");
			bos.close();
		}*/
		/*System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());*/
	}
}
