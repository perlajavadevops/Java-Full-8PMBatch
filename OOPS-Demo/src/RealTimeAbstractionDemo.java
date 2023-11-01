interface WorldBank {
	void getMoneyRules();
}

interface RBI_B extends WorldBank {
	float homeLoanRateOfInterest();

	float personalRateOfInterest();
}

class SBI_B implements RBI_B {

	@Override
	public float homeLoanRateOfInterest() {
		// TODO Auto-generated method stub
		return 9.00f;
	}

	@Override
	public float personalRateOfInterest() {
		return 10.25f;
	}

	@Override
	public void getMoneyRules() {
		System.out.println("World Bank Rules provided by worldbank for SBI....");

	}

}

class Axis_B implements RBI_B {
	@Override
	public float homeLoanRateOfInterest() {
		// TODO Auto-generated method stub
		return 9.15f;
	}

	@Override
	public float personalRateOfInterest() {
		// TODO Auto-generated method stub
		return 10.00f;
	}

	@Override
	public void getMoneyRules() {
		System.out.println("World Bank Rules provided by worldbank for Axis....");

	}
}

public class RealTimeAbstractionDemo {

	public static void main(String[] args) {

		RBI_B sbiBank = new SBI_B();
		System.out.println("SBI Home Loan: " + sbiBank.homeLoanRateOfInterest());
		System.out.println("SBI Personal Loan: " + sbiBank.personalRateOfInterest());
		sbiBank.getMoneyRules();

		RBI_B axisBank = new Axis_B();
		System.out.println("Axis Home Loan: " + axisBank.homeLoanRateOfInterest());
		System.out.println("Axis Personal Loan: " + axisBank.personalRateOfInterest());
		axisBank.getMoneyRules();
	}
}
