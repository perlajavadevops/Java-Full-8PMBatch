class Laptop {

	// 2 Types - instance and static class
	// Anonumus class
	public void getLaptDetails() {
		System.out.println("Lap Details.");
	}

	// instance class
	class Motherboard {
		public void getMotherInnerClassDetails() {
			System.out.println("MotherInnerClassDetails.");
		}
	}

	// static class
	static class LCDDisplay {
		public static void getLCDInnerClassDetails() {
			System.out.println("LCDInnerClassDetails.");
		}
	}
	//Inner interface
	interface A{
		public void getA();
	}
	
	class B implements A{
		@Override
		public void getA() {
			System.out.println("A-B class");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		Laptop.Motherboard motherBoard = lap.new Motherboard();//Instance Inner class object creation
		lap.getLaptDetails();
		motherBoard.getMotherInnerClassDetails();
		
		Laptop.LCDDisplay.getLCDInnerClassDetails();//static class method calling
		
		Laptop.A innerA= lap.new B();//Instance Inner interface object creation
		innerA.getA();
	}
	
}
