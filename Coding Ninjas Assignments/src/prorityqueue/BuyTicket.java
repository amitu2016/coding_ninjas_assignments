package prorityqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuyTicket {

	public static int buyTicket(int input[], int k) {
		// Queue to store indexes
		Queue<Integer> queue = new LinkedList<>();

		// Priority Queue to store actual elements
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < input.length; i++) {
			queue.add(i); // stores the index in the form of queue
			pq.add(input[i]); // stores the input element in Max Heap from increasing to decreasing order

		}

		int time = 0;

		while (!queue.isEmpty()) {
			// if element in the start of array is not the largest in the array,
			// then push the element to the last of the array
			if (input[queue.peek()] < pq.peek()) {
				queue.add(queue.poll()); // remove the index from the queue, and add it to the end of the index
												// queue
			} else {
				// if the element at the quee index is the largest, then pop and add 1 to time

				int index = queue.poll();
				pq.remove();
				time++;

				if (index == k) { //if the index is same as mentioned in  the function, break and come out of the loop
					break;
				}

			}

		}

		return time;

	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 2, 4};
		int k = 3;
		System.out.println(buyTicket(arr, k));
	}

}
