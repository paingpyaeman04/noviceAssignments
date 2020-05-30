package novice.assignments2.customexception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	public EmployeeException(String reason, String emp) {
		super(reason + ": " + emp);
	}
}
