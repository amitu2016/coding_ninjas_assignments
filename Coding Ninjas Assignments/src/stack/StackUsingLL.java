package stack;

import linkedList.Node;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void push(T elem) {
		Node<T> node = new Node<T>(elem);
		if (head == null) {
			head = node;
			size++;
		} else {
			node.next = head;
			head = node;
			size++;
		}
	}
	
	public T pop() throws StackEmptyException {
		while (head != null) {
			Node<T> temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
		throw new StackEmptyException();
	}
	
	public T top() throws StackEmptyException {
		while(head != null) {
			return head.data;
		}
		throw new StackEmptyException();
	}
	
}
