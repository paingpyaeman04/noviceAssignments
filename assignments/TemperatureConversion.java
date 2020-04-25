package novice.assignments;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Temperature Conversation");
		System.out.println("------------------------");
		System.out.println("1. F to C");
		System.out.println("2. C to F");
		System.out.print("Your choice : ");
		int choice = myScan.nextInt();
		
		double tempF, tempC;
		
		if(choice == 1) {
			System.out.print("Enter Temperature in Fahrenheit : ");
			tempF = myScan.nextDouble();
			tempC = (tempF - 32) * 5/9;
			System.out.println("Converted temperature is " + Math.round(tempC) + "C");
			
		} else {
			System.out.print("Enter Temperature in Celsius : ");
			tempC = myScan.nextDouble();
			tempF = (tempC * 9/5) + 32;
			System.out.println("Converted temperature is " + Math.round(tempF) + "F");
			
		}
		
		myScan.close();

	}

}
