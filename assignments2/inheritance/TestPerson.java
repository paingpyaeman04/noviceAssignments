package novice.assignments2.inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Student s = new Student("Su", "Su", 2000, "Java", "6th Batch");
		s.printInfo();
		System.out.println();

		Teacher t = new Teacher("Myo", "Myo", 1980, 340000, "CEIT");
		t.printInfo();

	}

}
