package prorityqueue;

public class PQUse {

	public static void main(String[] args) throws PriorityQueueException {
		Priority_Queue<String> pq = new Priority_Queue<>();
		
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("ghi", 19);
		pq.insert("dsaf", 9);
		pq.insert("dwew", 100);
		pq.insert("zddda", 20);
		
		while (!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
		

	}

}
