package linkedList2;


public class DeleteNodeWithoutHead {
	
	public static void deleteNode(Node<Integer> del) {
		 if(del == null) {
			return; 
		 }else {
			 if(del.next == null) {
				 return;
			 }
		 }
		 
		 Node<Integer> temp = del.next;
		 
		 del.data = temp.data;
		 
		 del.next = del.next.next;
		 
	 }
	    
	public static void printRecursive(Node<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data+" -> ");
		printRecursive(head.next);
		
	}

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(35);
		Node<Integer> n2 = new Node<>(15);
		Node<Integer> n3 = new Node<>(4);
		Node<Integer> n4 = new Node<>(20);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		System.out.println("Initial Linked list");
		printRecursive(head);
		System.out.println();
		deleteNode(n2);
		System.out.println("Linked list after deletion of 15");
		printRecursive(head);
	}

}
