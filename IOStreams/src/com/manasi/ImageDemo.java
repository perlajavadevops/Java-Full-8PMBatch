package com.manasi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageDemo {

	public static void main(String[] args) throws IOException {
	//	FileInputStream fis = new FileInputStream("D:/core java ppt/reddy.jpg");
		BufferedImage image = null;

		//FileOutputStream fos = new FileOutputStream("D:/FilesDemo/manasi1.jpg");// /

		image = ImageIO.read(new File("D:/core java ppt/reddy.jpg"));
		ImageIO.write(image, "jpg", new File("D:/FilesDemo/kings1.jpg"));
	}
}

//Serialization
