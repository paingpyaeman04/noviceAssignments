package novice.assignments2;

public class GoTooFar {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int i = 0;
		try {
			while(true)
				System.out.println(arr[i++]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Now you've gone too far");	
		}
		

	}

}
