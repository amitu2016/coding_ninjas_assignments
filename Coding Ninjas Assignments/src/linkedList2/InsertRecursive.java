package linkedList2;

public class InsertRecursive {

	public static Node<Integer> insertRecursive(Node<Integer> head, int ele, int pos){
		if (head == null && pos > 0) {
			return head;
		}
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(ele);
			newNode.next = head;
			//head = newNode;
			return newNode;
		}else {
			head.next = insertRecursive(head.next, ele, pos - 1);
			return head;
		}
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
		Node<Integer> res = insertRecursive(head, 20, 8);
		printRecursive(res);
	}

}
