package com.pgr.eightpm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(200);
		al.add(2000);
		al.add(300);//Boolean
		al.add(100);//Integer
		al.add(100);//Integer
		
		//System.out.println(al.size());
		
		/*
		 * for(int i = 0; i<=arr.length-1; i++) {//2<2 normal for-loop
		 * System.out.println(arr[i]); }
		 */
		
		//using normal for loop
		
		for(int i = 0; i<=al.size()-1; i++) {//2<2 normal for-loop 
			System.out.println(al.get(i));
		}
		
		//for-each loop or enchanced for loop
		/*
		 * System.out.println("==============="); 
		 * for(int val : numbers ) {
		 * System.out.println(val); }
		 */
		System.out.println("=======for-each loop or enchanced for loop=========");
		for (int val : al) {
			System.out.println(val);
		}
		
		System.out.println("=======Iterator=========");
		Iterator<Integer> itr = al.iterator();//in forward direction
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//a ---> b 
		//a <--- b
		System.out.println("=======ListIterator-- forward direction=========");
		ListIterator<Integer> listItr = al.listIterator();//in forward direction
		/*
		 * while(listItr.hasNext()) { System.out.println(listItr.next()); }
		 */
		System.out.println("=======ListIterator-- backward direction=========");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		//System.out.println(al);
		
		
		
	}
}
