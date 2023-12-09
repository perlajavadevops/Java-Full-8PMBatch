package com.pgr.reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/application.properties");
		Properties proo = new Properties();
		proo.load(fis);

		// proo.remove("db.username");
		System.out.println(proo.get("db.username"));
		System.out.println(proo.get("db.password"));
		System.out.println(proo.get("db.url"));
	}
}
