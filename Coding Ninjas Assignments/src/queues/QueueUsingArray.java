package queues;

public class QueueUsingArray {
	private int front;
	private int rear;
	private int size;
	private int data[];

	public QueueUsingArray() {
		data = new int[5];
		front = -1;
		rear = -1;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(int elem) throws QueueFullException {
		if (size > data.length - 1) {
			//throw new QueueFullException();
			doubleCapacity();
		}

		if (size == 0) {
			data[0] = elem;
			front++;
			rear++;
			size++;
		} else {
//			rear++;
//			if (rear > data.length - 1) {
//				rear = 0;
//			}
			rear = (rear + 1) % data.length;
			data[rear] = elem;
			size++;
		}

	}

	private void doubleCapacity() {
		//System.out.println("Double capacity called");
		int temp[] = data;
		data = new int[2 * temp.length];
		int index = 0;
		
		for (int i = front; i < temp.length; i++) {
			data[index++] = temp[i];
		}
		
		for (int i = 0; i < front - 1; i++) {
			data[index++] = temp[i];
		}
		
		front = 0;
		rear = temp.length - 1;
	}

	public int front() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}

		return data[front];
	}

	public int dequeue() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		if (size == 0) {
			front = -1;
			rear = -1;
		}
		int temp = data[front];
//		front = front + 1;
//		if (front > data.length - 1) {
//			front = 0;
//		}
		front = (front + 1) % data.length;
		size--;
		return temp;
	}

}
