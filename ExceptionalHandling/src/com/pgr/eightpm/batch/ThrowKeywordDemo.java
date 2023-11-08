package com.pgr.eightpm.batch;

public class ThrowKeywordDemo {

	public static void nullCheck() {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException ne) {
			//ne.printStackTrace();// Loggers
			throw new NullPointerException("Given string s is null...");//Unchecked exp implicitly propegated
			//
		}

	}

	public static void main(String[] args) {
		nullCheck();
	}
}
//Exception in thread "main" java.lang.NullPointerException: null