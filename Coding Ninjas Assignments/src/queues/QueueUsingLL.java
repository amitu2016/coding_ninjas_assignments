package queues;

import linkedList.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T elem) {
		Node<T> node = new Node<>(elem);
		if(size == 0) {
			front = node;
			rear = node;
			size ++;
		}else {
			rear.next = node;
			rear = rear.next;
			size ++;
		}
	}
	
	public T front() throws QueueEmptyException {
		if (size == 0 && front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException {
		if (size == 0 && front == null) {
			throw new QueueEmptyException();
		}
		Node<T> temp = front;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size --;
		return temp.data;
	}
	
}
