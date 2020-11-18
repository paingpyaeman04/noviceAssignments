package novice.assignments;

import java.util.Scanner;

public class AdvancedBmiCalculator {
	private Scanner myScan;
	
	public AdvancedBmiCalculator() {
		this.myScan = new Scanner(System.in);
	}
	
	public void metric() {
		System.out.print("Enter weight in kg : ");
		double weight = this.myScan.nextDouble();
		System.out.print("Enter height in cm : ");
		double height = this.myScan.nextDouble()/100;
		calculate(weight, height);
	}
	
	public void british() {
		System.out.print("Enter weight in lbs : ");
		double weight = this.myScan.nextDouble();
		System.out.print("Enter height in ft and in : ");
		double feet = this.myScan.nextDouble();
		double inches = this.myScan.nextDouble();
		double height = feet + inches/12;
		
		double weightKg = weight/2.205;
		double heightMetre = height/3.281;
		
		calculate(weightKg, heightMetre);
	}
	
	public void calculate(double weight, double height) {
		double bmi = weight/ (height*height);
		System.out.println("BMI : " + bmi);
		
		if(bmi > 0 && bmi <= 18)
			System.out.println("Underweight");
		else if(bmi > 18 && bmi <= 24)
			System.out.println("Normal");
		else if(bmi > 24 && bmi <= 29)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose the unit system:"
				+ "\n1) Metrics\n2) British");
		System.out.print("Your choice : ");
		byte choice = scan.nextByte();
		
		AdvancedBmiCalculator bmiCalculator = new AdvancedBmiCalculator();
		
		switch(choice) {
			case 1: bmiCalculator.metric(); break;
			case 2: bmiCalculator.british(); break;
			default: System.out.println("Invalid Input!");
		}
		
		scan.close();

	}

}
