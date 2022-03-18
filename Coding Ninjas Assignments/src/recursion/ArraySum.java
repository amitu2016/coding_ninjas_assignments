package recursion;

import java.util.Scanner;

public class ArraySum {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}
	
	public static int sum(int input[]) {
		
		
        return sum(input,input.length);
        
	}
    
    private static int sum(int input[],int N){
        if(N <= 0){
            return 0;
        }
        
        return sum(input,N-1) + input[N-1];
    }
}
