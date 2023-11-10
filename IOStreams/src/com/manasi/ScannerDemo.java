package com.manasi;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		float f = sc.nextFloat();
		
		System.out.println(i);
		System.out.println(f);
		sc.close();
	}
}
