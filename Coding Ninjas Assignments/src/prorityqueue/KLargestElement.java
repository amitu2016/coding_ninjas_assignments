package prorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer> output = new ArrayList<>();
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
		
		while (!pq.isEmpty()) {
			output.add(pq.poll());
		}
		
		return output;
	}

	public static void main(String[] args) {
		int arr[] = {3,8,4,1,9,6,2,5,7};
		int k = 3;
		
		ArrayList<Integer> res = kLargest(arr, k);
		
		for(int i: res) {
			System.out.println(i);
		}
		

	}

}
