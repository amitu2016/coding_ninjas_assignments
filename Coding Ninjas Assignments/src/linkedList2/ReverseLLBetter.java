package linkedList2;

public class ReverseLLBetter {
	
	//O(n) solution
	public static DoubleNode reverseLinkedList(Node<Integer> head) {
		DoubleNode ans;
		if (head == null || head.next == null) {
			ans = new DoubleNode(head,head);
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		DoubleNode smallAns = reverseLinkedList(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	
	public static Node<Integer> reverseLinkedList1(Node<Integer> head) {
		DoubleNode ans = reverseLinkedList(head);
		return ans.head;
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
 		Node<Integer> res = reverseLinkedList1(head);
 		printRecursive(res);
	}
}
