package com.pgr.eightpm.batch;

public class ExceptionDemo2DirectExceptionClass {

	public static void main(String[] args) {

		System.out.println("Hi");

		try {

			int[] arr = { 9, 8, 0 };// 0,1,2
			System.out.println(arr[1]);
			int a = 90 / 0;
			System.out.println(a);
		} catch (Exception ae) {
			// 1 printStackTrace
			ae.printStackTrace();
		} /*   //Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for RuntimeException
			 * catch (ArrayIndexOutOfBoundsException ae) { // 1 printStackTrace
			 * ae.printStackTrace(); }
			 */
		System.out.println("I got output....");

	}
}
