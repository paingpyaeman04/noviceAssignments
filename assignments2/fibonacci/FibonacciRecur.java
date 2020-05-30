package novice.assignments2.fibonacci;

import java.util.Scanner;

class FibonacciRecur
{ 
	public static void main(String args[]) 
	{ 
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = myScan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			int fiboTerm = fib(i);
			sum += fiboTerm;
			System.out.print(fiboTerm + " ");
			
		}
		
		double avg = (double)sum/n;
		System.out.println("\nAverage = " + avg);
		
		myScan.close();
	}
	
	private static int fib(int n) {
		if(n == 1)
			return 0;
		if(n == 2 || n == 3)
			return 1;
		else 
			return fib(n-2) + fib(n-1);
	}
} 
