package linkedList2;

public class AddTwoNumbersLL {

	public static Node<Integer> addTwoLists(Node<Integer> first, Node<Integer> second){
        //Reversing first and second nodes
		first = revNode(first);
        second = revNode(second);
        
        //Calling function to add two nodes
        Node<Integer> ans = add(first,second);
        
        //Reversing the ans node
        ans = revNode(ans);
        
        return ans;
    }
	
	
	public static Node<Integer> add(Node<Integer> first, Node<Integer> second) {
		int carry = 0;
		//Creating a dummy node
		Node<Integer> dummy = new Node<Integer>(0);
		
		//creating a temp node to point to dummy node
		Node<Integer> temp = dummy;
		
		//Looping through both linked lists
		while (first != null || second != null || carry != 0) {
			
			// storing the node values in val1 and val2
			int val1 = 0;
			if(first != null)
				val1 = first.data;
			
			int val2 = 0;
			if(second != null)
				val2 = second.data;
			
			int sum = carry + val1 + val2;
			
			int digit = sum % 10;
			
			carry = sum / 10;
			
			// Creating a new node and appending it to the next of dummy node
			Node<Integer> node = new Node<Integer>(digit);
			temp.next = node;
			temp = temp.next;
			
			// Incrementing first and second only when they are not having null value
			if(first != null)
				first = first.next;
			
			if(second != null)
				second = second.next;
		}
		
		//Returning next of dummy node which will be head of final node
		return dummy.next;
	}


	public static Node<Integer> revNode(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> smallHead = revNode(head.next);
		Node<Integer> revTail = head.next;
		revTail.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static void printRecursive(Node<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data+" -> ");
		printRecursive(head.next);
		
	}
	
	public static void main(String[] args) {
		
		Node<Integer> n1 = new Node<>(5);
//		Node<Integer> n2 = new Node<>(3);
//		Node<Integer> n3 = new Node<>(5);
		Node<Integer> n4 = new Node<>(1);
		Node<Integer> n5 = new Node<>(2);
		Node<Integer> n6 = new Node<>(4);
//		Node<Integer> n7 = new Node<>(12);
//		Node<Integer> n8 = new Node<>(15);
		Node<Integer> head1 = n1;
//		n1.next = n2;
//		n2.next = n3;
		Node<Integer> head2 = n4;
		n4.next = n5;
		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
		
		Node<Integer> res = addTwoLists(head1, head2);
		printRecursive(res);
	}

}
