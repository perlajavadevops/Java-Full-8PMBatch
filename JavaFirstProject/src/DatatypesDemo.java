
public class DatatypesDemo {

	static int a = 80;//4//studentId customerId, order_id orderId
	static long b;//8
	static short c = 90;//2 -320000 to +320000
	static byte d = 10;//1 //A -->0 to 10 B --> 10 to 20 -127 to 127
	static char e ='@';//2 --> ''
	static boolean f;//1bit false or true
	static float g;//4 
	static double i = 90;// i 90

	public static void main(String[] args) {
		
		
		int l = e;
		System.out.println(l);
		
		/*
		 * c = d;
		 * 
		 * d =(byte) c;
		 * 
		 * b = (long) i;
		 * 
		 * g = a;
		 */
		
		System.out.println("default value of int is: " + a);
		System.out.println("default value of long is: " + b);
		System.out.println("default value of short is: " + c);
		System.out.println("default value of byte is: " + d);
		System.out.println("default value of char is: " + e);
		System.out.println("default value of boolean is: " + f);
		System.out.println("default value of float is: " + g);
		System.out.println("default value of double is: " + i);
	}
}
