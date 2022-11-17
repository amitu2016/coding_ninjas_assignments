package recursion3;

public class MinimumInArray {
	
	private static void minimum(int[] arr, int startIndex, int minSoFar) {
		if (startIndex == arr.length) {
			System.out.println(minSoFar);
			return;
		}
		
		int newMin = minSoFar;
		
		if (arr[startIndex] < minSoFar) {
			newMin = arr[startIndex];
		}
		
		minimum(arr, startIndex + 1, newMin);
		
	}
	
	public static void minimum(int arr[]) {
		
		minimum(arr,0,Integer.MAX_VALUE);
		
	}


	public static void main(String[] args) {
		int arr[] = {3,6,2,1,5,7,4};
		minimum(arr);
	}

}
