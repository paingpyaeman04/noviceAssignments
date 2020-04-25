package novice.assignments;

import java.util.Scanner;

public class FurnitureCompany {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Choose wood for table:\n"
				+ "P - pine\nO - oak\nM - mahogany");
		System.out.print("Your choice : ");
		char choice = myScan.nextLine().toUpperCase().charAt(0);
		
		switch(choice) {
			case 'P': System.out.println("Pine tables cost $100"); break;
			case 'O': System.out.println("Oak tables cost $225"); break;
			case 'M': System.out.println("Mahogany tables cost $310"); break;
			default: System.out.println("Invalid Input!");
		}
		
		myScan.close();

	}

}
