package linkedList2;

public class ReverseLLBest {
	
	
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
		Node<Integer> res = revNode(head);
		printRecursive(res);
	}

}
