package novice.assignments;

public class HarmonicSum {

	public static void main(String[] args) {
		int i, n = 50000;
		double sumLToR = 0.0, sumRToL = 0.0;
		
		for(i = 1; i <= n; i++) {
			sumLToR += 1.0/i;
			sumRToL += 1.0/(n-i+1);
		}
		
		System.out.println("Harmonic Sum from left to right: " + sumLToR);
		System.out.println("Harmonic Sum from right to left: " + sumRToL);
		System.out.println("Difference in sum : " + (sumLToR - sumRToL));

		// There is indeed a slight difference between these two sums
		// None of those sums is actually accurate because of rounding errors in floating numbers
		
	}

}
