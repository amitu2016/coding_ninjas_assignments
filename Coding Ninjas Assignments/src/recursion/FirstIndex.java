package recursion;

public class FirstIndex {
	
	public static void main(String[] args) {
int[] arr = new int[] {1,2,3,4,3,6};
		
		System.out.println(firstIndex(arr, 9));
	}
	
	public static int firstIndex(int a[], int x) {
		
		if(a.length == 0) {
			return -1;
		}
		
		if(a[0] == x) {
			return 0;
		}
		

		int[] smallArray = new int[a.length - 1];
		
		for (int i = 1; i < a.length; i++) {
			smallArray[i - 1] = a[i];
		}
		
		int fi = firstIndex(smallArray, x);
		
		if(fi == -1) {
			return -1;
		}else {
			return fi + 1;
		}
		
	} 

}
