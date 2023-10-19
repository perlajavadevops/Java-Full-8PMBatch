
public class ThisKeywordMethodArgDemo {

	public void getA() {
		/*
		 * ThisKeywordMethodArgDemo d = new ThisKeywordMethodArgDemo(); getB(d);
		 */
		getB();
	}
	
	public void getB(/* ThisKeywordMethodArgDemo demo */) {
		
		System.out.println("getB :: "/* +demo.hashCode() */);
		
	}
	
	public static void main(String[] args) {
		ThisKeywordMethodArgDemo dem1 = new ThisKeywordMethodArgDemo();
		dem1.getA();
		System.out.println("obj "+dem1.hashCode());
		dem1.getB(/* dem1 */);
	}
}
