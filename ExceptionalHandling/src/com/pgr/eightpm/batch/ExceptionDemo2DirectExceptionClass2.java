package com.pgr.eightpm.batch;

public class ExceptionDemo2DirectExceptionClass2 {

	public static void main(String[] args) {

		System.out.println("Hi");

		try {

			int[] arr = { 9, 8, 0 };// 0,1,2
			System.out.println(arr[1]);
			int a = 90 / 0;
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException ae) {
			// 1 printStackTrace
			ae.printStackTrace();
		} catch (Exception ae) { // 1 printStackTrace
			ae.printStackTrace();
		}

		System.out.println("I got output....");

	}
}
