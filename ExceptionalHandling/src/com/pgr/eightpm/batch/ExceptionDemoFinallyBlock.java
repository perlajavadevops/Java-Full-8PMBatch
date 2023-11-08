package com.pgr.eightpm.batch;

public class ExceptionDemoFinallyBlock {

	public static void main(String[] args) {

		System.out.println("Hi");

		try {

			int[] arr = { 9, 8, 0 };// 0,1,2
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			// 1 printStackTrace
			ae.printStackTrace();
		} finally {
			System.out.println("Finally block will execute always wether exception is handled or not....");
		}
		System.out.println("I got output....");

	}
}
