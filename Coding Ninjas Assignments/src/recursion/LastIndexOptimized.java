package recursion;

public class LastIndexOptimized {
	
	public static void main(String[] args) {
int[] arr = new int[] {1,2,3,4,3,6};
		
		System.out.println(lastIndex(arr, 3, 0));
	}
	
	public static int lastIndex(int a[], int x, int index) {
		
		if(index == a.length) {
			return -1;
		}
		

		int k = lastIndex(a, x, index + 1);
		
		if(k != -1) {
			return k;
		}else {
			if(a[index] == x) {
				return index;
			}else {
				return -1;
			}
		}
		
	} 

}
