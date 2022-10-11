package queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRecursion {

	public static void reverseQueue(Queue<Integer> input) {
		// Base Case
		if (input.size() == 0) {
			return;
		}

		int fr = input.peek();

		input.poll();

		reverseQueue(input);

		input.add(fr);

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
		
		reverseQueue(queue);
		
		print(queue);
		
	}
}
