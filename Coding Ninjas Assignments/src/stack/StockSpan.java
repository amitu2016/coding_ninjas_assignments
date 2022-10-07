package stack;

import java.util.Stack;

public class StockSpan {

	public static int[] stockSpan(int[] price) {
		Stack<Integer> s = new Stack<>();
		s.push(0);
		int arr[] = new int[price.length];
		arr[0] = 1;
		
		for (int i = 1; i < price.length; i++) {
			while (s.isEmpty() == false && price[s.peek()] < price[i]) {
				s.pop();
			}
			
			int span = s.isEmpty() ? i + 1 : i - s.peek();
			arr[i] = span;
			s.push(i);
		}
		
		return arr;	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10, 10, 10, 10};
		int res[] = stockSpan(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
