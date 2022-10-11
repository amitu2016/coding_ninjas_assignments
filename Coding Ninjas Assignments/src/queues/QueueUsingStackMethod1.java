package queues;

import java.util.Stack;

public class QueueUsingStackMethod1<T> {
     Stack<T> stack1;
     Stack<T> stack2;
	
     public QueueUsingStackMethod1() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
     
     public void enqueue(T data) {
    	 stack1.push(data);
     }
     
     public T dequeue() throws QueueEmptyException {
    	 if(stack1.isEmpty() && stack1.isEmpty()) {
    		 throw new QueueEmptyException();
    	 }
    	 
    	 if(stack2.isEmpty()) {
    		 while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
    	 }
    	 
    	 T elem = stack2.pop();
    	 if(stack1.isEmpty()) {
    		 while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
    	 }
    	 return elem;
     }
     
     public int size() {
    	 return stack1.size();
     }
     
     public boolean isEmpty() {
    	 return stack1.isEmpty();
     }
     
     public T front() throws QueueEmptyException {
    	 if(stack1.isEmpty() && stack1.isEmpty()) {
    		 throw new QueueEmptyException();
    	 }
    	 
    	 if(stack2.isEmpty()) {
    		 while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
    	 }
    	 
    	 T elem = stack2.peek();
    	 if(stack1.isEmpty()) {
    		 while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
    	 }
    	 return elem;
     }
     
     
}
