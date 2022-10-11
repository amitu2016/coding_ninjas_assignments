package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelementsInQueue {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		 if (input.isEmpty() == true || k > input.size())
	            return null;
	        if (k <= 0)
	            return null;
	        
	        Stack<Integer> stack = new Stack<Integer>();
	        
	        // Push the first K elements into a Stack
	        for (int i = 0; i < k; i++) {
	            stack.push(input.peek());
	            input.remove();
	        }
	 
	        // Enqueue the contents of stack
	        // at the back of the input
	        while (!stack.empty()) {
	            input.add(stack.peek());
	            stack.pop();
	        }
	 
	        // Remove the remaining elements and enqueue
	        // them at the end of the Queue
	        for (int i = 0; i < input.size() - k; i++) {
	            input.add(input.peek());
	            input.remove();
	        }
	        
	        return input;
	}
	
	public static void print(Queue<Integer> input) {
		while (!input.isEmpty()) {
			System.out.print(input.poll()+" ");
		} 
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		
		reverseKElements(queue, 5);
		
		print(queue);
	}

}
