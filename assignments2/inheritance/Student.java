package novice.assignments2.inheritance;

public class Student extends Person {
	private String course;
	private String batch;

	public Student(String firstName, String lastName, int birthYear, String course, String batch) {
		super(firstName, lastName, birthYear);
		this.course = course;
		this.batch = batch;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	public void printInfo() {
		System.out.println("Student name: " + super.getFirstName() + " " + super.getLastName());
		System.out.println("Student BirthYear: " + super.getBirthYear());
		System.out.println("Course Name: " + this.course);
		System.out.println("Batch: " + this.batch);
	}

}
