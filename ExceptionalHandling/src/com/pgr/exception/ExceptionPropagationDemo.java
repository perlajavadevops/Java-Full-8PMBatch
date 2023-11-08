package com.pgr.exception;

class A {

	public static void m() {

		String s = null;
		System.out.println(s.length());
	}

	public static void n() {

		try {
			m();
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

		/*
		 * String s = null; System.out.println(s.length());
		 */
	}
}

public class ExceptionPropagationDemo {
	public static void main(String[] args) {
		A.n();
	}
}
