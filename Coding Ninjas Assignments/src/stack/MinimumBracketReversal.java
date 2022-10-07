package stack;

import java.util.Stack;

public class MinimumBracketReversal {

	
	public static int countBracketReversals(String input) {
		// In case of odd no. of braces returning -1
		if (input.length() % 2 == 1) {
			return -1;
		}

		Stack<Character> s = new Stack<>();
		char str[] = input.toCharArray();
		for (int i = 0; i < str.length; i++) {
			char ch = str[i];
			//Pushing all opening braces into stack
			if (ch == '{') {
				s.push(ch);
			} else {
				//if we encounter closing braces and top of stack is an opening braces
				//then popping the brace as it will make a valid expression
				if (!s.isEmpty() && s.peek() == '{') {
					s.pop();
				}else {
					//Else pushing braces into stack
					s.push(ch);
				}
			}

		}
		
		
		// At this stage our stack will contain only invalid braces
		//Now calculating answer by using formula (a + 1)/2 + (b + 1)/2
		int a = 0, b = 0;
		while (!s.isEmpty()) {
			if (s.peek() == '{') {
				b ++;
			}else {
				a++;
			}
			s.pop();
		}
		
		int ans = (a + 1)/2 + (b + 1)/2 ;
		return ans;
	}
	
	public static void main(String[] args) {
		String input = "{{{{}}";
		int count = countBracketReversals(input);
		System.out.println(count);
	}

}
