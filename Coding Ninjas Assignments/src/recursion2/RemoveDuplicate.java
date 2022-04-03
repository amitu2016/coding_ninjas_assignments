package recursion2;

public class RemoveDuplicate {
    
    public static String removeConsecutiveDuplicates(String s) {
		if (s.length() <= 1) {
            return s;
        }

        String smallOutput = removeConsecutiveDuplicates(s.substring(1));

        if (smallOutput.charAt(0) == s.charAt(0)) {
            return smallOutput;
        } else {
            return s.charAt(0) + smallOutput;
        }

	}

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("xxxyyyzwwzzz"));
    }
}
