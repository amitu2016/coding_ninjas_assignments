package stack;

public class StackUsingArray {
     private int data[];
     private int topIndex;

	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
	}

	public void push(int elem) throws StackFullException {
		if(topIndex == data.length -1) {
			throw new StackFullException();
		}
		data[++topIndex] = elem;
	}

	public int top() throws StackEmptyException {
		if (topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}

	public int pop() throws StackEmptyException {
		if (topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}

	public int size() {
		return topIndex + 1;
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}
     
     
     
     
}
