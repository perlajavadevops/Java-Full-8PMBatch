package com.google;

import com.pgr.ProtectedDemo;

public class ProtectedDemoOutSidePackage extends ProtectedDemo{

	public static void main(String[] args) {
		ProtectedDemoOutSidePackage demo = new ProtectedDemoOutSidePackage();
		demo.m();
		System.out.println(demo.sno);
	}

}
