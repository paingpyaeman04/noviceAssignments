package novice.assignments2.customexception;

public class Employee {
	private int idNum;
	private double hourlyWage;

	public Employee(int idNum, double hourlyWage) throws EmployeeException {
		if (hourlyWage < 6.0 || hourlyWage > 50.0)
			try {
				throw new EmployeeException("Invalid pay rate", "id=" + idNum + " pay rate=" + hourlyWage);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
			}
		else {
			this.idNum = idNum;
			this.hourlyWage = hourlyWage;
		}
	}

	@Override
	public String toString() {
		return "Employee Id: " + this.idNum + "\tHourlyWage: " + this.hourlyWage;
	}
	
	

}
