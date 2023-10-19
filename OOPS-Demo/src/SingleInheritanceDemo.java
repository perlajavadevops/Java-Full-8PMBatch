class Trainner {

	float salary = 300;

	public void teaching(int a) {
		System.out.println("Traninner is teaching subject.....");
	}
	
	public void labPractice() {
		System.out.println("Trainner has given practice ....");
	}
}

class JavaTrainner extends Trainner {

	float salary = 400;
	
	@Override
	public void teaching(int param) {
		System.out.println("Traninner is teaching Java Technologies subject.....");
	}
	
	public void labTest() {
		System.out.println("Java Trainner is taking java certification.....");
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {

		Trainner trainner = new Trainner();
		trainner.teaching(10);
		trainner.labPractice();
		
		System.out.println(trainner instanceof JavaTrainner);//false
		
		//trainner.labTest(); //java compili time error
		System.out.println(trainner.salary);

		// sub class object creation
		JavaTrainner javaTrainner = new JavaTrainner();
		javaTrainner.teaching(10);//
		javaTrainner.labPractice();
		javaTrainner.labTest();
		System.out.println(javaTrainner.salary);
		
		System.out.println(javaTrainner instanceof JavaTrainner);//true
		System.out.println(javaTrainner instanceof Trainner);//true

		// sub class object creation
		Trainner trainner2 = new JavaTrainner();
		System.out.println(trainner2);// Trainner@4361bd48

		trainner2.teaching(10);
		
		trainner2.labPractice();
		
		System.out.println(trainner2.salary);
		
		System.out.println(trainner2 instanceof JavaTrainner);//true
		System.out.println(trainner2 instanceof Trainner);//true
		System.out.println(trainner2 instanceof Object);//true
		
		if(trainner2 instanceof JavaTrainner) {
			
			JavaTrainner tr = (JavaTrainner) trainner2;
			tr.labTest();;
		}
		
		//JavaTrainner trainner3 =  (JavaTrainner) new Trainner();// ClassCastException -- runtime exception

		/*
		 * if() {
		 * 
		 * }
		 */
	}

}
