package novice.assignments;

import java.util.Scanner;

public class BmiCalculator {
	
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.print("Input weight in kilograms : ");
		double weight = myScan.nextDouble();
		
		System.out.print("Input height in centimeters : ");
		double height = myScan.nextDouble() / 100;
		
		double bmi = weight / (height*height);
		
		System.out.println("Body Mass Index is " + bmi);
		myScan.close();

	}

}
