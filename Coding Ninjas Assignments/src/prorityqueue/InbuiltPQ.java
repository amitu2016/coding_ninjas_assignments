package prorityqueue;

import java.util.PriorityQueue;

public class InbuiltPQ {

	public static void main(String[] args) {
		int arr[] = {3,8,4,1,9,6,2,5,7};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		
		while (!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.poll();
		}

	}

}
