package novice.assignments;

public class Numbers2 {
	
	public int product(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		Numbers2 obj = new Numbers2();
		int result = obj.product(x, y);
		
		System.out.println("Product = " + result);

	}

}
