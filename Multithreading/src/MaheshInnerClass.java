
class Computer{
	
	
	
	static interface D{
		void innerM();
	}
	
	//Instance inner class
		class OperatingSystem implements D{
			public void m(){
				System.out.println("Inner class m() method .. ");
				
				class LocalMethodClass{
					public void q(){
						System.out.println("local class q() method");
					}
				}
				
				LocalMethodClass localM = new LocalMethodClass();
				localM.q();
			}

			@Override
			public void innerM() {
				System.out.println("Hello Innner Interface method");				
			}
		}
	
	
	static class Keyboard{
		public static void staticInnM(){
			System.out.println("Static inner class staticInnM() method...");
		}
	}
	
	private static class B{
		private void p(){
			System.out.println("private inner class P() instance method");
		}
	}
	
	public static void n(){
		System.out.println("static n() method");
		
		B b = new B();
		b.p();
	}
	
	protected class C{
		
	}
	
}
public class MaheshInnerClass {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		Computer.OperatingSystem system = computer.new OperatingSystem();
		system.m();
		system.innerM();
		Computer.n();
		
		Computer.Keyboard.staticInnM();
		
		Computer.C prot = computer.new C();
		
		Thread th = Thread.currentThread();
		System.out.println(th.getName());
		//Computer.D d = computer.new D();

		
		
	//	Computer.
	}
}
