package queues;

public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		int arr[] = {10,20,30,40,50,60};
		
		QueueUsingArray queue = new QueueUsingArray(2);
		System.out.println("Enqueue Operation");
		for (int i = 0; i < arr.length; i++) {
			queue.enqueue(arr[i]);
		}
		
		
		System.out.println("Dequeue Opreration");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(queue.dequeue());
		}
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.enqueue(40);
//		queue.enqueue(50);

		System.out.println(queue.size());
//		System.out.println("Front Element before dequeue opration = "+queue.front());
//		System.out.println(queue.dequeue());
//		System.out.println("Front Element after dequeue opration = "+queue.front());
		System.out.println(queue.isEmpty());
		
		
	}

}
