package recursion;

public class SortedArrayOptimised {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6};
		
		System.out.println(isArraySorted(arr, 0));
		
	}
	
	public static boolean isArraySorted(int A[], int index) {
		
		if(index == A.length - 1) {
			return true;
		}
		
		if(A[index] > A[index + 1]) {
			return false;
		}
		
		
		boolean isSorted = isArraySorted(A, index + 1);
		
		return isSorted;
		
	}

}
