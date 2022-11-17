package recursion3;

public class ReturnSubsequences {

	public static String[] returnSubSequence(String s) {
		// Base case
		if (s.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}

		String[] smallOutput = returnSubSequence(s.substring(1));
		String[] output = new String[2 * smallOutput.length];

		for (int i = 0; i < smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}

		for (int i = 0; i < smallOutput.length; i++) {
			output[smallOutput.length + i] = s.charAt(0) + smallOutput[i];
		}

		return output;

	}

	public static void main(String[] args) {
		String input = "abc";
		String ans[] = returnSubSequence(input);
		
		for(String s : ans) {
			System.out.println(s);
		}

	}

}
