package com.pgr.exception;

public class NestedTryDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String s = "Hidfssdfds";
			System.out.println(s.length());
			
			try {
				int arr[] = new int[2];
				arr[0] = 90;
				arr[1] = 60;
				arr[2] = 80;
			} catch (ArrayIndexOutOfBoundsException exce) {
				exce.printStackTrace();
				// System.err.println(exce.getMessage());
			}finally {
				System.out.println("1erwwr Finally block will be executed always whether we handled the exception or not");
			}
			
		} catch (NullPointerException ex) {
			ex.printStackTrace();//logs
		} finally {
			System.out.println("34444 Finally block will be executed always whether we handled the exception or not");
		}

		System.out.println("End");
	}
}
