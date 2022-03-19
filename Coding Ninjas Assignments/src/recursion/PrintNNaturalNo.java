package recursion;

import java.util.Scanner;

public class PrintNNaturalNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		 print(n);
		 s.close();
	}

	private static void print(int n) {
		
		if(n == 0){
            return;
        }
        
        print(n - 1);
        
        System.out.print(n+" ");
		
	}

}
