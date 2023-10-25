class FinalVariable{
	
	public final double pi;//normal variable. //String class...
	
	public FinalVariable(double pi) {
		this.pi = pi;
	}
	
	public static final double PI_VALUE = 3.14;//Public constants....
	
	//PANCARD, AADHAR, PASSPORT, ACCOUNT_NUMBER, SSN, COUNRY, STATE, SUNDAY.. A
	
	
}

public class FinalVariablesdemo {

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable(3.14);
		FinalVariable finalVariable1 = new FinalVariable(34.14);
		//finalVariable.pi  = 90.90;
	}
}
