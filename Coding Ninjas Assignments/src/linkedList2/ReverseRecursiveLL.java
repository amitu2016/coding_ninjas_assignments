package linkedList2;

public class ReverseRecursiveLL {
	
	//O(n^2) solution
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> smallerHead = reverseLL(head.next);
		Node<Integer> tail = smallerHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		
		tail.next = head;
		head.next = null;
		return smallerHead;
	}

	public static void printRecursive(Node<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.println(head.data+" ");
		printRecursive(head.next);
		
	}
	
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		Node<Integer> n6 = new Node<>(60);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		Node<Integer> res = reverseLL(head);
		printRecursive(res);
	}

}
