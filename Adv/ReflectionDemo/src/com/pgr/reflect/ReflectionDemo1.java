package com.pgr.reflect;

public class ReflectionDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//String s = "Hello";
		
		//Class<String> s = (Class<String>) Class.forName("java.lang.String");
		
		Class<Student> s = (Class<Student>) Class.forName("com.pgr.reflect.Student");
		
		
		//String ss = s.newInstance();
		
		Student st1 = s.newInstance();
		System.out.println(st1);
		//System.out.println(ss.length());
	}
}
