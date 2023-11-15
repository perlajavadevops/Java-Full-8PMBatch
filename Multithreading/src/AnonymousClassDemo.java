interface Bike{
	public void speed();
	public void limit();
}

/*class Honda implements Bike{
	public void speed() {
		System.out.println("hello");
	}
}
*/
public class AnonymousClassDemo {

	public static void main(String[] args) {
		Bike bike = new Bike() {
			
			@Override
			public void speed() {
				System.out.println("Inner speed method...");				
			}
			
			@Override
			public void limit() {
				System.out.println("Limit method...");
			}
		};
		
				
		bike.speed();
		bike.limit();
	}
}
