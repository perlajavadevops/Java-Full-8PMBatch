//only in the runtime
public class InvalidAgeException extends Exception {

	private String errorMessage;
	private String errorCode;
	
	public InvalidAgeException(String errorMessage, String errorCode){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	
}
