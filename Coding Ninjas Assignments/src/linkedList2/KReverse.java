package linkedList2;

public class KReverse {
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(head == null) {
			return null;
		}
		
		LinkedListNode<Integer> prev = null, next = null, curr = head;
		
		int count = 0;
		
		/* Reverse first k nodes of linked list */
		while(count < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count ++;
		}
		
		/* next is now a pointer to (k+1)th node
        Recursively call for the list starting from
        current. And make rest of the list as next of
        first node */
		if(next != null) {
			head.next = kReverse(next, k);
		}
		
		// prev is now head of input list
		return prev;
		
	}
	
	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.println(head.data+" ");
		printRecursive(head.next);
		
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
		LinkedListNode<Integer> n2 = new LinkedListNode<>(20);
		LinkedListNode<Integer> n3 = new LinkedListNode<>(30);
		LinkedListNode<Integer> n4 = new LinkedListNode<>(40);
		LinkedListNode<Integer> n5 = new LinkedListNode<>(50);
		LinkedListNode<Integer> n6 = new LinkedListNode<>(60);
		LinkedListNode<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		LinkedListNode<Integer> res = kReverse(head, 2);
		printRecursive(res);
	}

}
