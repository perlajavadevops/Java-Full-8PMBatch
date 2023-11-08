package com.pgr.eightpm.batch;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void fileCheck() throws IOException {

		FileInputStream fis = new FileInputStream("abc1.txt");

	}

	public static void main(String[] args) throws IOException {// IOStreams...
		fileCheck();
	}

}
