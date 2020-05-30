package novice.assignments2.inheritance;

public class Teacher extends Person {
	private double salary;
	private String department;

	public Teacher(String firstName, String lastName, int birthYear, double salary, String department) {
		super(firstName, lastName, birthYear);
		this.salary = salary;
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println("Teacher name: " + super.getFirstName() + " " + super.getLastName());
		System.out.println("Teacher BirthYear: " + super.getBirthYear());
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary);
	}

}
