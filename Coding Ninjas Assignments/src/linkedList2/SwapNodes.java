package linkedList2;

public class SwapNodes {

	 // This function will swap two nodes by their given positions
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		LinkedListNode<Integer> prevNode1 = null, 
				prevNode2 = null, node1 = head, node2 = head;
		
		// Checks if list is empty
		if (head == null) {
			return head;
		}
		

        // If i and j are equal, then
        // list will remain the same
		if(i == j) {
			return head;
		}
		
		int pos1 = 0;
		
		// Search for node1
		while(node1 != null && pos1 < i) {
			prevNode1 = node1;
			node1 = node1.next;
			pos1++;
		}
		
		int pos2 = 0;
		
		// Search for node2
		while(node2 != null && pos2 < j) {
			prevNode2 = node2;
			node2 = node2.next;
			pos2++;
		}
		
		if(node1 != null && node2 != null) {
			

            // If previous node to node1 is not null then,
            // it will point to node2
			// Otherwise it is head so swapped node will be head
			if (prevNode1 != null) {
				prevNode1.next = node2;
			} else {
				head = node2;
			}
			
			// If previous node to node2 is not null then,
            // it will point to node1
			// Otherwise it is head so swapped node will be head
			if (prevNode2 != null) {
				prevNode2.next = node1;
			} else {
				head = node1;
			}
			
			// Swaps the next nodes of node1 and node2
			LinkedListNode<Integer> temp = node1.next;
			node1.next = node2.next;
			node2.next = temp;
		}else {
			return head;
		}
		
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
		LinkedListNode<Integer> res = swapNodes(head, 1, 4);
		printRecursive(res);
	}

}
