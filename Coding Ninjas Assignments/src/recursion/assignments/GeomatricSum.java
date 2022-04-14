package recursion.assignments;

import java.lang.Math;

public class GeomatricSum {
	
	public static double findGeometricSum(int k){
		
		if(k == 0) {
			return 1;
		}
		
			
		return findGeometricSum(k - 1) + (1 / Math.pow(2, k));
	}
	
	
	public static void main(String[] args) {
	   double result =	findGeometricSum(4);
	   System.out.println(result);
	}
}
