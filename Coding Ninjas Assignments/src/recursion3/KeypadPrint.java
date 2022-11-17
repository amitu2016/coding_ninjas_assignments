package recursion3;
import java.util.Scanner;

public class KeypadPrint {

	
	public static String getOptions(int digit) {
		if (digit == 2) {
			return "abc";
		}
		if (digit == 3) {
			return "def";
		}
		if (digit == 4) {
			return "ghi";
		}
		if (digit == 5) {
			return "jkl";
		}
		if (digit == 6) {
			return "mno";
		}
		if (digit == 7) {
			return "pqrs";
		}
		if (digit == 8) {
			return "tuv";
		}
		if (digit == 9) {
			return "wxyz";
		}
		return "";
	}
	
	public static void printKeypad(int input){
		printKeypad(input,"");
	}
	
	private static void printKeypad(int input, String stringSoFar) {
		if (input == 0) {
			System.out.println(stringSoFar);
			return;
		}
		
		int smallInput = input / 10;
		int lastDigit = input % 10;
		
		String optionsLastdigit = getOptions(lastDigit);
		
		for (int i = 0; i < optionsLastdigit.length(); i++) {
			printKeypad(smallInput, optionsLastdigit.charAt(i) + stringSoFar);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		printKeypad(input);

	}

}
