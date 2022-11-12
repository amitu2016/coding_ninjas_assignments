package prorityqueue;

import java.util.ArrayList;

public class Priority_Queue<T> {

	private ArrayList<Element<T>> heap;

	public Priority_Queue() {
		heap = new ArrayList<>();
	}

	public void insert(T value, int priority) {
		Element<T> e = new Element<>(value, priority);
		heap.add(e);

		// Finding index of child and parent
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		// traversing the heap till we set the inserted element at its proper place
		while (childIndex > 0) {
			if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {

				// Swapping child elememt with parent element
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;

			} else {
				return;
			}
		}

	}

	public T getMin() throws PriorityQueueException {
		if (isEmpty()) {
			throw new PriorityQueueException();
		}

		return heap.get(0).value;
	}

	public T removeMin() {
		// Element to be removed is present at 0th index
		Element<T> removed = heap.get(0);
		T ans = removed.value;

		// Replace the value at 0th index with value at last index
		heap.set(0, heap.get(heap.size() - 1));

		heap.remove(heap.size() - 1);

		int parentIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2 * parentIndex - 1;

		while (leftChildIndex < heap.size()) {
			int minIndex = parentIndex;

			if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}

			if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = rightChildIndex;
			}
			
			if (minIndex == parentIndex ) {
				break;
			}
			
			// Swapping the values
			Element<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);

			parentIndex = minIndex;
			leftChildIndex = 2 * parentIndex + 1;
			rightChildIndex = 2 * parentIndex - 1;

		}
		
		return ans;
	}

	public int size() {
		return heap.size();
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

}
