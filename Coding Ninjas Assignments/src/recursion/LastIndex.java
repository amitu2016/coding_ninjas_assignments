package recursion;

public class LastIndex {
	
	public static void main(String[] args) {
int[] arr = new int[] {1,2,3,4,3,6};
		
		System.out.println(lastIndex(arr, 3));
	}
	
	public static int lastIndex(int a[], int x) {
		
		if(a.length == 0) {
			return -1;
		}
		

		int[] smallArray = new int[a.length - 1];
		
		for (int i = 1; i < a.length; i++) {
			smallArray[i - 1] = a[i];
		}
		
		int k = lastIndex(smallArray, x);
		
		if(k != -1) {
			return k + 1;
		}else {
			if(a[0] == x) {
				return 0;
			}else {
				return -1;
			}
		}
		
	} 

}
