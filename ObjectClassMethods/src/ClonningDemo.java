
public class ClonningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student(101, "Gangadhar", "ABC");

		st.displayStudentDetails();
		Student st1 = (Student) st.clone();

		System.out.println("=========");

		System.out.println(st1.hashCode());
		System.out.println(st.hashCode());
		st1.displayStudentDetails();

	}
}
