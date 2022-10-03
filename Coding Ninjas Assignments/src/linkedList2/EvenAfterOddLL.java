package linkedList2;

public class EvenAfterOddLL {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		if(head == null || head.next ==  null) {
			return head;
		}
		
		LinkedListNode<Integer> evenStart = null;
		LinkedListNode<Integer> evenEnd = null;
		LinkedListNode<Integer> oddStart = null;
		LinkedListNode<Integer> oddEnd = null;
		LinkedListNode<Integer> currNode = head;
		
		while (currNode != null) {
			int ele = currNode.data;
			if (ele % 2 == 0) {
				
				if (evenStart == null) {
					evenStart = currNode;
					evenEnd = evenStart;
				} else {
					evenEnd.next = currNode;
					evenEnd = evenEnd.next;
				}
				
			} else {
				if (oddStart == null) {
					oddStart = currNode;
					oddEnd = oddStart;
				} else {
					oddEnd.next = currNode;
					oddEnd = oddEnd.next;
				}
			}
			
			currNode = currNode.next;
		} 
		
		if (evenStart == null || oddStart == null) {
			return head;
		}
		
		oddEnd.next = evenStart;
		evenEnd.next = null;
		return head;
	
	}
	
	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.println(head.data+" ");
		printRecursive(head.next);
		//System.out.println(head.data+" ");
		
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> n1 = new LinkedListNode<>(1);
		LinkedListNode<Integer> n2 = new LinkedListNode<>(2);
		LinkedListNode<Integer> n3 = new LinkedListNode<>(3);
		LinkedListNode<Integer> n4 = new LinkedListNode<>(4);
		LinkedListNode<Integer> n5 = new LinkedListNode<>(5);
		LinkedListNode<Integer> n6 = new LinkedListNode<>(6);
		LinkedListNode<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		LinkedListNode<Integer> res = evenAfterOdd(head);
		printRecursive(res);
	}

}
