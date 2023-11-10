
public class VoteEligibilityChecking {

	public static void validateAge(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("Invalid Age for Vote.", "INVALIDAGE101");
		} else {
			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(19);
		} catch (InvalidAgeException e) {
			System.err.println(e.getErrorMessage()+", "+e.getErrorCode());// ATLS105
		}
	}
}