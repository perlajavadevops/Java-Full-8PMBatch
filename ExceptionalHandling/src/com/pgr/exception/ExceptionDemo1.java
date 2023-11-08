package com.pgr.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Start");
		String s = "Hidfssdfds";
		try {
			
			System.out.println(s.length());
			
			int arr[] = new int[2];
			arr[0] = 90;
			arr[1] = 60;
			arr[2] = 80;
			
		} catch (NullPointerException ex) {
			ex.printStackTrace();//logs
		} catch(ArrayIndexOutOfBoundsException exce){
			exce.printStackTrace();
			//System.err.println(exce.getMessage());
		} finally {
			s = null;//
			//System.gc();
			//Runtime.getRuntime().gc();
			System.out.println("Finally block will be executed always whether we handled the exception or not");
		}

		System.out.println("End");
	}
}
