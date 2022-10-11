package queues;

public class QueueUsingStackUse {

	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingStackMethod1<Integer> queue = new QueueUsingStackMethod1<>();

		System.out.println("Enqueue Operation");
		for (int i = 1; i <= 10; i++) {
			queue.enqueue(i*10);
			//System.out.println("Size = "+queue.size());
		}
		
		System.out.println("Dequeue Operation");
		for (int i = 1; i <= 10; i++) {
			 System.out.println(queue.dequeue()); 
			// System.out.println("Size = "+queue.size());
		}
		
		
		System.out.println("Size = "+queue.size());
		System.out.println("Empty ? "+queue.isEmpty());
	}

}
