package pattern2;

public class Pattern1 {
	
	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			
			for (int j = n; j > i ; j--) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		pattern1(5);

	}

}
