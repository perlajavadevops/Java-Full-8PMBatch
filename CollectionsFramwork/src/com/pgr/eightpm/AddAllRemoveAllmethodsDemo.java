package com.pgr.eightpm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddAllRemoveAllmethodsDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(200);
		al1.add(2000);
		al1.add(300);// Boolean

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(100);// Integer
		al2.add(600);// Integer
		al2.add(300);
		
		//al1.addAll(al2);
		//al1.removeAll(al2);
		//al1.retainAll(al2);
		
		//al1.remove(1);
		//al1.remove(new Integer(300));
		//al1.removeIf();
		
		System.out.println(al1.contains(200));
		
		//al1.clear();
		
		/*
		 * Object[] arr = al1.toArray();
		 * 
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		
		System.out.println(al1.containsAll(al2));
		//System.out.println(al1.isEmpty());
		Iterator<Integer> itr = al1.iterator();// in forward direction
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		int[] arr = new int[4];//3 
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 1;
		
		List al3 = Arrays.asList(1,1,3,4,5,6);
		System.out.println(al3);

	}
}
