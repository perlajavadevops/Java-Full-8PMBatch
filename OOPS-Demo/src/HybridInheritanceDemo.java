class MahindraMotors1 {

	public String getFeatures() {
		//System.out.println("Mahindra Motors having good features....");
		return "Features";
	}
}

class MahindraThar_Petrol extends MahindraMotors1 {

	@Override
	public String getFeatures() {
		//System.out.println("MahindraThar having good features....");
		return "MahindraThar_Petrol";
	}

}

class MahindraThar_Deisel extends MahindraMotors1 {

	@Override
	public String getFeatures() {
		//System.out.println("MahindraThar having good features....");
		return "MahindraThar_Deisel";
	}

}

class MahindraThar_Deisel_AX extends MahindraThar_Deisel {

	@Override
	public String getFeatures() {
		//System.out.println("MahindraThar having good features....");
		return "MahindraThar_Deisel_AX";
	}

}

class MahindraThar_Deisel_BX extends MahindraThar_Deisel {

	@Override
	public String getFeatures() {
		//System.out.println("MahindraThar having good features....");
		return "MahindraThar_Deisel_BX";
	}

}

public class HybridInheritanceDemo {

}
