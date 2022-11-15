package prorityqueue;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}
		
		
		for (int i = k; i < input.length; i++) {
			if (pq.peek() < input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		
		int res = pq.peek();
		
		return res;

	}

	public static void main(String[] args) {
		int arr[] = {9, 4, 8, 7, 11, 3};
		int k = 2;
		int n = arr.length;
		
		System.out.println(kthLargest(n, arr, k));

	}

}
