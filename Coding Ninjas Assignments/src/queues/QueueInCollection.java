package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollection {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		System.out.println("Enqueue Operation");
		
		for (int i = 1; i <= 10; i++) {
			queue.add(i*10);
			//System.out.println("Size = "+queue.size());
		}
		
		System.out.println("Dequeue Operation");
		for (int i = 1; i <= 10; i++) {
			 System.out.println(queue.poll()); 
			// System.out.println("Size = "+queue.size());
		}
		

		System.out.println("Size = "+queue.size());
		System.out.println("Empty ? "+queue.isEmpty());

	}

}
