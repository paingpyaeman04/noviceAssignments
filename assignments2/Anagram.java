package novice.assignments2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public boolean checkAnagram(String s1, String s2) {
		char chArr1[] = s1.replaceAll("[^A-Za-z]+", "").toLowerCase().toCharArray();
		char chArr2[] = s2.replaceAll("[^A-Za-z]+", "").toLowerCase().toCharArray();
		
		if(chArr1.length != chArr2.length)
			return false;

		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		
		for(int i = 0; i < chArr1.length; i++) {
			if(chArr1[i] != chArr2[i])
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter two words or phrases: ");
		String str1 = myScan.nextLine();
		String str2 = myScan.nextLine();
		
		Anagram a = new Anagram();
		
		if(a.checkAnagram(str1, str2))
			System.out.println("The two words or phrases are anagram of each other");
		else
			System.out.println("The two words or phrases are not anagram of each other");
		
		myScan.close();
	}

}
