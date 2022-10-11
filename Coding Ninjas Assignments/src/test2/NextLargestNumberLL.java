package test2;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class NextLargestNumberLL {
	
	public static LinkedListNode<Integer> nextLargeNumberUtil(LinkedListNode<Integer> head) {
		// res is head node of the resultant list
		  LinkedListNode<Integer> res = head;
		  LinkedListNode<Integer> temp = null, prev = null;
		   int carry = 1, sum;
		   
		   while(head != null) {
			   
			    // Calculate value of next digit in resultant
	            // list. The next digit is sum of following
	            // things (i) Carry (ii) Next digit of head list
	            // (if there is a next digit)
			   sum = carry + head.data;
			   
			// update carry for next calculation
			   carry = (sum >= 10) ? 1 : 0; 
			
			  // update sum if it is greater than 10 
			   sum = sum % 10;
			  
			   // Create a new node with sum as data
			   head.data = sum;
			   
			   // Move head and second pointers to next nodes
			   temp = head;
			   
			   head = head.next;
		   }
		   
		// if some carry is still there, add a new node to
	    // result list.
		   if(carry > 0)
			   temp.next = new LinkedListNode<Integer>(carry);
		   
		   return res;
		   
	}
	
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		   head = reverse(head);
		   
		   head = nextLargeNumberUtil(head);
		   
		   return reverse(head);
	}
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		LinkedListNode<Integer> next = null, curr = head, prev = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> node1 = new LinkedListNode<Integer>(9);
		LinkedListNode<Integer> node2 = new LinkedListNode<Integer>(9);
		LinkedListNode<Integer> node3 = new LinkedListNode<Integer>(8);
		LinkedListNode<Integer> head = node1;
		node1.next = node2;
		node2.next = node3;
		
		LinkedListNode<Integer> res = nextLargeNumber(head);
		
		while(res != null) {
			System.out.println(res.data);
			res = res.next;
		}

	}

}
