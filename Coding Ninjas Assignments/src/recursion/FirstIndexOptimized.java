package recursion;

public class FirstIndexOptimized {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 3, 6 };

		System.out.println(firstIndex(arr, 6, 0));
	}

	public static int firstIndex(int a[], int x, int index) {

		if (index == a.length) {
			return -1;
		}

		if (a[index] == x) {
			return index;
		}

		int fi = firstIndex(a, x, index + 1);
		return fi;

	}

}
