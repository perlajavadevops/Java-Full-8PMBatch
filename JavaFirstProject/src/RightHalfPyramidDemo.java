public class RightHalfPyramidDemo {

	public static void main(String[] args) {

		/*
		 * int rows = 5; for (int i = 0; i < rows; i++) {
		 * 
		 * for (int j = 0; j <= i; j++) { System.out.print("* "); }
		 * System.out.println(""); }
		 */
		
		int rows = 5;
		for (int i = rows; i >=0; i--) {

			for (int j = rows; j >= rows-i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
