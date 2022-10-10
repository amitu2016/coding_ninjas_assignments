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
		if (size > data.length -1) {
			throw new QueueFullException();
		}
		
		if(front == -1 && rear == -1) {
			data[0] = elem;
			front ++;
			rear ++;
			size ++;
		}else {
			data[++rear] = elem;
			size ++;
		}
		
	}

	public int front() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		
		return data[front];
	}

	public int dequeue() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		if(size == 0) {
			front = -1;
			rear = -1;
		}
        int temp = data[front];
        front = front + 1;
        size --;
        return temp;
	}

}
