package stack;

public class StackUseLL {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println("Popping");
		System.out.println(stack.pop());
		System.out.println("Size after pop");
		System.out.println(stack.size());
		System.out.println("Value at top = "+stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Value at top = "+stack.top());
		System.out.println(stack.size());
	}

}
