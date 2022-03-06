package patterns;

import java.util.Scanner;

public class CharacterPatternAssignmentSolution2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			int j = 1;
			char p =  (char) ('A' + i - 1);
			while(j <= i) {
				char charPtrn = (char) (p);
				System.out.print(charPtrn);
				j++;
				p++;
			}
			System.out.println();
			i++;
		}

		sc.close();
	}

}
