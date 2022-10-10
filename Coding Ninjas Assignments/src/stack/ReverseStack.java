package stack;

import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int top=input.pop();
        reverseStack(input,extra);
        
        while(!input.isEmpty())
        {
            extra.push(input.pop());
        }
        
        input.push(top);
        
        while(!extra.isEmpty())
        {
            input.push(extra.pop());
        }
		
	}
	
	public static void main(String[] args) {
		// initialize stack
		  Stack<Integer> s = new Stack<Integer>();
		  Stack<Integer> e = new Stack<Integer>();
		  // push elements
		  s.push(1);  
		  s.push(2);
		  s.push(3);
		  s.push(4);
		 
		  // print elements before reversing
		  System.out.println("Stack before reversing:");
		  System.out.println(s);
		 
		  // reverse stack using reverseStack()
		  reverseStack(s,e); // using stacks
		 
		 
		  // print elements after reversing
		  System.out.println("Stack after reversing:");
		  System.out.println(s);

	}

}
