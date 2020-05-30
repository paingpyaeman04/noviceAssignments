package novice.assignments2.customexception;

public class ThrowEmployee {
	
	public static void main(String[] args) throws EmployeeException {
	
		Employee emp1 = new Employee(1, 5);
		System.out.println(emp1);
		System.out.println();
		
		Employee emp2 = new Employee(2, 25);
		System.out.println(emp2);
		System.out.println();
		
		Employee emp3 = new Employee(3, 56);
		System.out.println(emp3);
		
	}

}
