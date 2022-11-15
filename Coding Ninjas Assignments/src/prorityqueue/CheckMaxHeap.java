package prorityqueue;

public class CheckMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		int i = 0;
		int n = arr.length;

		while (i < n) {
			int parentIndex = i;
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			if (leftChildIndex < n && arr[parentIndex] < arr[leftChildIndex]) {
				return false;
			}

			if (rightChildIndex < n && arr[parentIndex] < arr[rightChildIndex]) {
				return false;
			}

			i++;
		}

		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 42, 20, 18, 6, 14, 11, 9, 4 };
		System.out.println(checkMaxHeap(arr));
	}

}
