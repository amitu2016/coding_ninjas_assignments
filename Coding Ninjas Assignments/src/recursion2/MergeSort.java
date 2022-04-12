package recursion2;

public class MergeSort {

	
	//Function to implement merge sort
	public static void mergeSort(int a[]) {

		// Base case: If Array contains only one element 
		if (a.length <= 1) {
			return;
		}

		// create two new arrays
		int b[] = new int[a.length / 2];
		int c[] = new int[a.length - b.length];

		// copy half of the contents in b[i]
		for (int i = 0; i < a.length / 2; i++) {
			b[i] = a[i];
		}

		//copy half content in c[j]
		for (int j = a.length / 2; j < a.length; j++) {
			c[j - a.length / 2] = a[j];
		}

		// recursively calling merge sort on array b and c
		mergeSort(b);
		mergeSort(c);

		// calling merge function to merge the two sorted array
		merge(b, c, a);
	}

	//  Merge function to merge the two sorted array
	public static void merge(int[] s1, int[] s2, int[] d) {

		int i = 0;
		int j = 0;
		int k = 0;

		//Sorting the two array and copying the value in third array
		while (i < s1.length && j < s2.length) {
			if (s1[i] <= s2[j]) {
				d[k] = s1[i];
				i++;
				k++; 
			} else {
				d[k] = s2[j];
				j++;
				k++;
			}
		}
		
		// handling the condition when some elements are left to be copied after sorting operation
		
		if(i < s1.length) {
			while(i < s1.length) {
				d[k] = s1[i];
				i++;
				k++;
			}
		}
		
		if(j < s2.length) {
			while(j < s2.length) {
				d[k] = s2[j];
				j++;
				k++;
			}
		}
		
	}


	public static void main(String[] args) {
		int a[]={10,4,5,9,8,6,12,11,7};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
	}

}
