
public class OperatorOverloadingDemo {

	/*
	 * 10+10 ==> addition 20 20+20==> 40
	 * 
	 * "abc"+"def" ==>abcdef --> + operator will act as concatation 'a'+'c' ==>
	 * 97+99==>
	 * 
	 * 90+'c' ==>
	 * 
	 * 90+"Gangadhar" ==> con
	 * 
	 * "Gangadhar"+90+90 ==> con
	 * 
	 * 
	 * 90+90"Gangadhar" ==> con
	 */
			
	public static void main(String[] args) {
		System.out.println(10+10);//20
		System.out.println('c'+'a');//196
		System.out.println(10+'a');//107
		System.out.println(90+"Gangadhar");//90Gangadhar
		System.out.println(90+90+"Gangadhar");//180Gangadhar
		System.out.println("Gangadhar"+90+90);//Gangadhar9090
		System.out.println("Gangadhar"+(90+90));//Gangadhar180
		System.out.println(('c'+'c')+"aftab");//90aftab
		
	}
}
