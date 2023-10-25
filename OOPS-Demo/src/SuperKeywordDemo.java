class Bank {
	
	public void rules1() {
		System.out.println("RBI Rules for Personal loan....");
	}
	
}
class RBIBank extends Bank{
	
	float minimumBalance = 100;
	
	public void rules() {
		System.out.println("RBI Rules for Personal loan....");
	}
	
	public void rulesPersonalLoan() {
		System.out.println("RBI Rules for rulesPersonalLoan....");
	}
	
	public static void homeLoanRules() {
		System.out.println("RBI Rules for rulesPersonalLoan....");
	}
	
}

class SBIBank extends RBIBank{
	
	float minimumBalance = 200;
	
	@Override
	public void rules() {
		System.out.println("SBI Rules for Personal loan....");
		super.rulesPersonalLoan();
		super.rules1();
		homeLoanRules();
		System.out.println(super.minimumBalance);
	}
	
	public static void n() {
		/*
		 * super.rulesPersonalLoan(); super.rules1();
		 */
	}
}
public class SuperKeywordDemo {

	public static void main(String[] args) {
		SBIBank bank =  new SBIBank();
		bank.rules();
		
	}
}
