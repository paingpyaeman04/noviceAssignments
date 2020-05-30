package novice.assignments2.binarysearch;

import java.util.Scanner;

public class TestBinarySearch {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter number to be searched: ");
		int k = myScan.nextInt();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 34, 55};
		
		BinarySearch mySearcher = new BinarySearch();
		int index = mySearcher.search(arr, k, 0, arr.length-1);
		
		if(index == -1)
			System.out.println(k + " is not found");
		else
			System.out.println(k + " is found at index " + index);
		
		myScan.close();
	}
}
