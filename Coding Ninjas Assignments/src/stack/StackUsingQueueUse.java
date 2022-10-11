package stack;

public class StackUsingQueueUse {

	public static void main(String[] args) {
		StackUsingQueue<Integer> stack = new StackUsingQueue<>();
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
