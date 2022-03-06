package patterns;

import java.util.Scanner;

public class CharacterPatternAssignmentSolution3 {

	public static void main(String[] args) {
		int i, j;
		int letter = 64;
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		for (i = rows; i >= 1; i--) {
			for (j = i; j <= rows; j++) {
				System.out.print((char) (j + letter));
			}
			System.out.println();
		}
	}

}
