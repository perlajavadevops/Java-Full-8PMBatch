
public class Student implements Cloneable {

	private int sno;
	private String name;
	private String colleage;

	public Student(int sno, String name, String colleage) {
		this.sno = sno;
		this.name = name;
		this.colleage = colleage;
	}

	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the colleage
	 */
	public String getColleage() {
		return colleage;
	}

	/**
	 * @param colleage the colleage to set
	 */
	public void setColleage(String colleage) {
		this.colleage = colleage;
	}

	public void displayStudentDetails() {
		System.out.println(sno);
		System.out.println(name);
		System.out.println(colleage);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
