package novice.assignments2.sorting;

import java.util.Arrays;

public class SortingTest {
	public static void main(String[] args) {
		int arr[] = {-18, 20, 2, 1, 5, 4, -9, 2, 56, 22, 12};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
