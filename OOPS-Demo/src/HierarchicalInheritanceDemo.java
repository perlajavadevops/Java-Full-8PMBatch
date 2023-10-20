
class MahindraMotors {

	public String getFeatures() {
		//System.out.println("Mahindra Motors having good features....");
		return "Features";
	}
}

class MahindraThar extends MahindraMotors {

	@Override
	public String getFeatures() {
		//System.out.println("MahindraThar having good features....");
		return "MahindraThar";
	}

}

class Mahindra300 extends MahindraMotors {

	@Override
	public String getFeatures() {
		//System.out.println("Mahindra300 having good features....");
		return "Mahindra300";
	}
}

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {

		MahindraMotors mahindraMotors1 = new MahindraThar();
		System.out.println(mahindraMotors1.getFeatures());// MahindraThar
		
		MahindraMotors mahindraMotors2 = new Mahindra300();
		System.out.println(mahindraMotors2.getFeatures());//Mahindra300
		
		System.out.println(mahindraMotors1 instanceof Mahindra300);//false
		System.out.println(mahindraMotors2 instanceof MahindraThar);//false
		System.out.println(mahindraMotors1 instanceof MahindraMotors);//true
		System.out.println(mahindraMotors2 instanceof MahindraMotors);//true
		

	}
}
