
public class DefaultConstructorDemo {

	int sno;
	String name;
	
	/*
	 * DefaultConstructorDemo(){ System.out.println("0-arg constructor....."); }
	 */

	//1-arg con
	DefaultConstructorDemo(int no){
		System.out.println("1-parameter constroct...."+no);
	}
	
	DefaultConstructorDemo(String no){
		System.out.println("1-parameter constroct...."+no);
	}
	
	DefaultConstructorDemo(int no, int a){
		System.out.println("2-parameter constroct...."+no+" "+a);
	}
	public static void main(String[] args) {

		//DefaultConstructorDemo de = new DefaultConstructorDemo();//object
		DefaultConstructorDemo de = new DefaultConstructorDemo(10);//object
		DefaultConstructorDemo de2 = new DefaultConstructorDemo(10, 20);//object
		
		System.out.println(de.sno);
		System.out.println(de.name);
		System.out.println("Testing default constroco....");
	}
}
