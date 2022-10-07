package stack;

import java.util.Stack;

public class RedundanrtBrackets {
	
	//A bracket is said to be redundant only if inside opening and closing braces, there is no operator present
	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> s = new Stack<>();
		char arr[] = new char[expression.length()];
		arr = expression.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			
			//Checking if the string contains either opening braces or an operator.
			//If found, pushing it to stack
			if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				s.push(ch);
			}else {
				// Now string will either contain closing braces or any lower case character
				//Ignoring lower case as it will not affect our logic
				if(ch == ')') {
					
					boolean isRedundant = true;
					
					//popping stack till a opening braces '(' is found
					while(s.peek() != '(') {
						char top = s.peek();
						
						//If any operator is found between two braces braces are not redundant
						if(top == '+' || top == '-' || top == '*' || top == '/') {
							isRedundant = false;
						}
						
						s.pop();
					}
					
					if (isRedundant == true) {
						return true;
					}
					
					s.pop();
					
				}
				
				
			}
			
			
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		String st = "((a+b))";
		
		boolean result = checkRedundantBrackets(st);
		System.out.println(result);

	}

}
