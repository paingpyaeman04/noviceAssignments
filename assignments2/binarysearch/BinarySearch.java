package novice.assignments2.binarysearch;

public class BinarySearch {
	public int search(int[] a, int k, int begin, int end) {
		if(begin <= end) {
			int m = (begin+end) / 2;
			
			if(k == a[m])
				return m;
			else if(k < a[m])
				return search(a, k, begin, m-1);
			else
				return search(a, k, m+1, end);
		}
		
		return -1;
	}
	
}
