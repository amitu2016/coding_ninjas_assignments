package linkedList;

public class RemoveDuplicatesLL {
	
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		Node<Integer> curr = head;
		
		//Traversing to the end of LL
		while(curr != null) {
			Node<Integer> temp = curr;
			
			//Checking for duplicates and skipping them
			while(temp!= null && temp.data.equals(curr.data)) {
				temp = temp.next;
			}
			
			//connecting current node with non duplicate node
			curr.next = temp;
			curr = curr.next;
		}
		
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(2);
		Node<Integer> n3 = new Node<>(2);
		Node<Integer> n4 = new Node<>(2);
		Node<Integer> n5 = new Node<>(5);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Node<Integer> res = removeDuplicates(head);
		printLL(res);
	}

}
