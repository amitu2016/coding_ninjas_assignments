package linkedList2;

public class SkipMDeleteN {
	
	// Function to skip M nodes and then
	// delete N nodes of the linked list.
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		LinkedListNode<Integer> currNode = head;
		LinkedListNode<Integer> delNode = null;
		
		// If we have to Skip 0 Nodes that means we have to delete all Nodes
		if(M == 0){
            head = null;
            return head;
        }
		
		// The main loop that traverses
	    // through the whole list 
		while(currNode != null) {
			
			int count = 1;
			// Skip M nodes 
			while(count < M && currNode != null) {
				currNode = currNode.next;
				count ++;
			}
			
			// If we reached end of list, then return 
			if(currNode == null) {
				return head;
			}
			
			// Start from next node and delete N nodes 
			delNode = currNode.next;
			
			int count2 = 1;
			
			while(count2 <= N && delNode != null) {
				LinkedListNode<Integer> temp = delNode;
				delNode = delNode.next;
				count2++;
			}
			
			// Link the previous list with remaining nodes 
			currNode.next = delNode;
			
			// Set current pointer for next iteration 
			currNode = delNode;
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
		
		LinkedListNode<Integer> res = skipMdeleteN(head, 0, 1);
		printRecursive(res);
	}

}
