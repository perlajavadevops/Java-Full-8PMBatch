interface AA {

	int speed = 90;//java compiler will public static final 
	
	public void m();
	
}

interface BB {
	public void m();
}

class C implements BB, AA {

	@Override
	public void m() {
		
		System.out.println("Hello M method from C class");
	}
}

public class MultipleInheritanceDemo_Interface {

	public static void main(String[] args) {

		AA cObj = new C();
		cObj.m();

		System.out.println(cObj instanceof AA);//true
		System.out.println(cObj instanceof BB);//true
		System.out.println(cObj instanceof C);//true
	}
}
