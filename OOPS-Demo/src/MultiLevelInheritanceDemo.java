class Car {

	public void gearChange() {
		System.out.println("Gear changed in Car....");
	}
}

class TataMotors extends Car {

	@Override
	public void gearChange() {
		System.out.println("TataMotors gearChange method");
	}
	
	public void speedLimit() {
		System.out.println("TataMotors speed limit is method");
	}
	
}

class Tata_Nexon extends TataMotors {
	@Override
	public void gearChange() {
		System.out.println("Tata_Nexon gearChange method");
	}
	
	@Override
	public void speedLimit() {
		System.out.println("Tata_Nexon speed limit is method");

	}
	public void getTataNexonFeatures() {
		System.out.println("SUV model...");
	}
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {

		Car car = new Car();
		car.gearChange();//Gear changed in Car....
		

		Car car1 = new TataMotors();
		car1.gearChange();//"TataMotors gearChange method"
				
		Car car2 = new Tata_Nexon();
		car2.gearChange();//"Tata_Nexon gearChange method"

		Tata_Nexon tata_Nexon = new Tata_Nexon();
		tata_Nexon.gearChange();//"Tata_Nexon gearChange method"
		tata_Nexon.speedLimit();
		tata_Nexon.getTataNexonFeatures();
		TataMotors tataMotors = new Tata_Nexon();
		tataMotors.gearChange();//"Tata_Nexon gearChange method"

		/*
		 * TataMotors tataMotors1 = (TataMotors) new Car(); tataMotors.gearChange();
		 */

		/*
		 * Tata_Nexon tataMotors2 = (Tata_Nexon) new TataMotors();
		 * tataMotors.gearChange();
		 */
		/*
		 * Tata_Nexon tataMotors3 = (Tata_Nexon) new Car(); tataMotors.gearChange();
		 */
	}
}
