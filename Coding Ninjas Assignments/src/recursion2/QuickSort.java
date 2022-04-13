package recursion2;

public class QuickSort {

	public static void quickSort(int[] a, int si, int ei) {
		//Base Case
		if (si > ei) {
			return;
		}

		// calling partition function to find pivot index
		int pivotIndex = partition(a, si, ei);

		// Calling quickSort function recursively  
		quickSort(a, si, pivotIndex - 1);
		quickSort(a, pivotIndex + 1, ei);
	}

	public static int partition(int[] a, int si, int ei) {
		//setting pivot element as first element of array
		int pivotElement = a[si];
		int smallerNoCount = 0;

		//find count of elements which are smaller than pivot element
		for (int i = si + 1; i <= ei; i++) {
			if (a[i] < pivotElement) {
				smallerNoCount++;
			}
		}

		// Swapping the position of the pivot element
		int temp = a[si + smallerNoCount];
		a[si + smallerNoCount] = pivotElement;
		a[si] = temp;

		int i = si;
		int j = ei;

		// Placing the elements of array at their correct position
		while (i < j) {

			if (a[i] < pivotElement) {
				i++;
			} else if (a[j] > pivotElement) {
				j--;
			} else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;

			}

		}

		//returning pivot index
		return si + smallerNoCount;
	}

	public static void main(String[] args) {
		int a[] = { 10, 4, 5, 9, 8, 6, 12, 11, 7 };
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
