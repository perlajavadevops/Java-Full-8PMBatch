
public class OrderDemo {

	// object level variables or instance memebers.
	int orderId;
	String item;
	double price;

	public OrderDemo(int orderId, String item, double price) {
		this.orderId = orderId;
		this.item = item;
		this.price = price;
	}

	public void displayOderDetails() {
		System.out.println(orderId);
		System.out.println(item);
		System.out.println(price);
	}

	public static void main(String[] args) {
		OrderDemo orderDemo1 = new OrderDemo(10, "T-shirt", 100);
		OrderDemo orderDemo2 = new OrderDemo(11, "Short", 40);
		OrderDemo orderDemo3 = new OrderDemo(12, "Cricket Ball", 20);

		// 4 orders
		/*
		 * OrderDemo orderDemo = new OrderDemo(); orderDemo.item = "T-Shirt";
		 * orderDemo.orderId = 1; orderDemo.price = 900;
		 * 
		 * OrderDemo orderDemo = new OrderDemo(); orderDemo.item = "T-Shirt";
		 * orderDemo.orderId = 1; orderDemo.price = 900;
		 * 
		 * OrderDemo orderDemo = new OrderDemo(); orderDemo.item = "T-Shirt";
		 * orderDemo.orderId = 1; orderDemo.price = 900;
		 * 
		 * OrderDemo orderDemo = new OrderDemo(); orderDemo.item = "T-Shirt";
		 * orderDemo.orderId = 1; orderDemo.price = 900;
		 */
		orderDemo1.displayOderDetails();
		System.out.println("==============");
		orderDemo2.displayOderDetails();
		System.out.println("==============");
		orderDemo3.displayOderDetails();
	}

}
