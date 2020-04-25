package novice.assignments;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter a word : ");
		String str = myScan.nextLine();
		
		String strNoSpace = str.toLowerCase().replaceAll("\\s", "");
		
		String strReversed = "";
		for(int i = strNoSpace.length()-1; i >= 0; i--) {
			strReversed += strNoSpace.charAt(i);
		}
		
		if(strReversed.equals(strNoSpace))
			System.out.println("\"" + str + "\"" + " is a palindrome");
		else
			System.out.println("\"" + str + "\"" + " is not a palindrome");
		
		myScan.close();

	}

}
