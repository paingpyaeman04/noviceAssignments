package novice.assignments2.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = myScan.nextInt();
		int f = 0, s = 1, t, i;
		int sum = 0;

		for(i = 1; i <= n; i++) {
			t = f+s;
			sum += f;
			System.out.print(f + " ");
			f = s;
			s = t;
		}
		
		double avg = (double)sum/n;
		System.out.println("\nAverage = " + avg);
		
		myScan.close();

	}

}
