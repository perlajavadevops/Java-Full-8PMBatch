package com.pgr.eightpm;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomObjectsDemo {

	public static void main(String[] args) {
		Order order1 = new Order(101, "Books");
		Order order2 = new Order(102, "Food");
		Order order3 = new Order(103, "Mobile");

		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order3);

		System.out.println("=======Iterator=========");
		Iterator<Order> itr = orderList.iterator();// in forward direction
		while (itr.hasNext()) {
			Order order = itr.next();
			System.out.println(order.getOrderId() + " " + order.getOrderName());
		}
	}
}
