package recursion;

public class SortedArray {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,49,5,6};
		
		System.out.println(isArraySorted(arr));
		
	}
	
	public static boolean isArraySorted(int A[]) {
		
		if(A.length == 1) {
			return true;
		}
		
		if(A[0] > A[1]) {
			return false;
		}
		
		int[] smallArray = new int[A.length - 1];
		
		for (int i = 1; i < A.length; i++) {
			smallArray[i - 1] = A[i];
		}
		
		boolean isSorted = isArraySorted(smallArray);
		
		return isSorted;
		
	}

}
