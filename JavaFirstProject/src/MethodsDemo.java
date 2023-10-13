
public class MethodsDemo {

	public static void m() {
		System.out.println("static method");
	}

	public void n() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		MethodsDemo.m();

		int i = 90;
		
		//classname ref varialg newkeyword 
		MethodsDemo demo = new MethodsDemo();// constructor concept
		//MethodsDemo() --> Constructor -->  default con
		//MethodsDemo --> classname
		//demo --> object ref varialbe
		//new -->keyword
		
		demo.n();
	}
}
