package novice.assignments;

public class Numbers {
	public void sum(int a, int b) {
		System.out.println("Sum = " + (a+b));
	}
	
	public void difference(int a, int b) {
		System.out.println("Difference = " + (a-b));
	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		Numbers obj = new Numbers();
		obj.sum(x, y);
		obj.difference(x, y);

	}
	
	

}
