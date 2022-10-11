package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
	Queue<T> q1;
	Queue<T> q2;
	
	
	public StackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public void push(T elem) {
		q2.add(elem);
		
		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		
		Queue<T> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public T pop() {
		if(q1.isEmpty()) {
			return null;
		}
		return q1.poll();
	}
	
	public int size() {
		return q1.size();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	
	public T top() {
		if(q1.isEmpty()) {
			return null;
		}
		return q1.peek();
	}
	
}
