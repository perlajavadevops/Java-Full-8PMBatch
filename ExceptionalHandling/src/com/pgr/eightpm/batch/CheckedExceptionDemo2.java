package com.pgr.eightpm.batch;

import java.io.IOException;

public class CheckedExceptionDemo2 {

	public static void fileCheck() throws IOException {

		throw new IOException("IO File Exception....");
	}

	public static void main(String[] args) throws IOException {// IOStreams...
		fileCheck();
	}

}
