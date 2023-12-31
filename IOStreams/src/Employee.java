import java.io.Serializable;

public class Employee implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 300;//Java Collections Framework
	//POJO(Plain-old-java-object)
	/**
	 * 
	 */
	
	public int empNo;
	public transient  String name;
	public long phoneNumber;
	public static final String COMPANY_NAME = "ABCD";
	public static final String COMPANY_NAME1 = "ABCD1";
	public float salary;

	public Employee(int empNo, String name, long phoneNumber, float salary) {
		this.empNo = empNo;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNo != other.empNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	public void displayEmplyee() {
		System.out.println(empNo);
		System.out.println(  );
		System.out.println(phoneNumber);
		System.out.println(salary);
		System.out.println(COMPANY_NAME);
	}

}
