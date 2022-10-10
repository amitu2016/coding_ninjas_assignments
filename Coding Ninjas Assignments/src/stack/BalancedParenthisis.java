package stack;

import java.util.Stack;

public class BalancedParenthisis {

	public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        char[] arr;
        
        arr = expression.toCharArray();
        for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
				continue;
			}

			 if(stack.isEmpty())
		        	return false;
		        
		        char res;
		        
		        switch(c) {
		        
		        case ')':
		        	res = stack.pop();
		        	if(res == '{' || res == '[') 
		        		return false;
		        	break;
		        	
		        
		        case '}':
		        	res = stack.pop();
		        	if(res == '(' || res == '[') 
		        		return false;
		        	break;
		        	
		        	
		        case ']':
		        	res = stack.pop();
		        	if(res == '{' || res == '(') 
		        		return false;
		        	break; 		
		        	
		        }    
		}
      
       return (stack.isEmpty()); 
    } 
	
	public static void main(String[] args) {
		boolean result = isBalanced("{{{1 + [2 * (3) + 2]}");
		System.out.println(result);
	}

}
