class ThisKeywordReturn{
	
	/*
	 * private ThisKeywordReturn(){
	 * 
	 * }
	 */
	
	ThisKeywordReturn(){
		
	}
	
	ThisKeywordReturn getObj() {
		
		/* ThisKeywordReturn de = new ThisKeywordReturn(); */
		System.out.println(this);
		return this;
	}
}

public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		ThisKeywordReturn re = new ThisKeywordReturn();
		re.getObj();
		System.out.println(re);
	}
	
}

