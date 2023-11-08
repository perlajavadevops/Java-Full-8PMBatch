package com.pgr.eightpm.batch;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("Hi");

		try {

			int[] arr = { 9, 8, 0 };// 0,1,2
			System.out.println(arr[4]);
			int a = 90 / 0;

			System.out.println(a);
		} catch (ArithmeticException ae) {
			// 1 printStackTrace
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ae) {
			// 1 printStackTrace
			ae.printStackTrace();
		}
		System.out.println("I got output....");

	}
}
