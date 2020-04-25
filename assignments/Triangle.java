package novice.assignments;

import java.util.Scanner;

public class Triangle {
	
	private static void checkTriangle(double a, double b, double c) {
		if(a+b > c && a+c > b && b+c > a) {
			System.out.println("Triangle is valid");
			if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a))
				System.out.println("Right Triangle");
			else if(a == b && b == c)
				System.out.println("Equilateral Triangle");
	
		} else
			System.out.println("Invalid Triangle!");
	}

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter lengths of a triangle: ");
		double a = myScan.nextDouble();
		double b = myScan.nextDouble();
		double c = myScan.nextDouble();
		
		checkTriangle(a, b, c);

		myScan.close();

	}

	

}
