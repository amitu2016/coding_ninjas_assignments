package pattern2;

public class Pattern3 {
	
	public static void pattern3(int n) {
		for (int i = 0; i < 2 * n; i++) {
			int column = 0;
			if(i < n) {
				column = i;
			}else {
				column = 2 * n - i;
			}
			
			for (int j = 0; j < column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		pattern3(5);
	}

}
