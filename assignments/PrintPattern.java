package novice.assignments;

import java.util.Scanner;

class Pattern {
	private int i, j;
	
	public void a(int size) {
		for(i = 1; i <= size; i++) {
			if(i%2 != 0)
				System.out.print(" ");
			for(j = 1; j <= size; j++) {
				if(j%2 != 0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void b(int size) {
		for(i = size; i > 0; i--) {
			for(j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void c(int size) {
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++) {
				if(j < i)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void d(int size) {
		for(i = 1; i <= size; i++) {
			for(j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public void e(int size) {
		for(i = 1; i <= size; i++) {
			for(j = 1; j <= size-i; j++) {
				System.out.print("  ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

public class PrintPattern {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Select your print pattern [a-e]: ");
		char choice = myScan.nextLine().toLowerCase().charAt(0);
		
		Pattern printer = new Pattern();
		
		int size = 9;
		switch(choice) {
			case 'a': printer.a(size); break;
			case 'b': printer.b(size); break;
			case 'c': printer.c(size); break;
			case 'd': printer.d(size); break;
			case 'e': printer.e(size); break;
			default: System.out.println("Invalid Input!");
		}
	
		myScan.close();
		
	}

}
