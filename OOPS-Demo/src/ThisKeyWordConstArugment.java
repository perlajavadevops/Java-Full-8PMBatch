class Item {

	int itemId;

	Item() {
		System.out.println("0-arg constru");
		/* Item item1 = new Item(); */
		ItemDetails dt = new ItemDetails(this);
	}

}

class ItemDetails {

	public ItemDetails(Item item) {
		System.out.println("Item Details 1-arg con");
	}
}

public class ThisKeyWordConstArugment {

	public static void main(String[] args) {
		Item item1 = new Item();
	}
}
