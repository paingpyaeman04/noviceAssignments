package novice.assignments2.sorting;

public class QuickSort {
	
	public void sort(int[] arr, int low, int high) {
		 if(low < high) {
			 int pivot = partition(arr, low, high);
			 
			 sort(arr, low, pivot-1);
			 sort(arr, pivot+1, high);
		 }
	}
	
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		int temp;
		
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				
			}
		}
		temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		return i;
	}
	
	
}