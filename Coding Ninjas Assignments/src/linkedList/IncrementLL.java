package linkedList;

public class IncrementLL {
	
	public static void incrementLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			temp.data ++;
			temp = temp.next;
		}
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		incrementLL(head);
		printLL(head);
	}
	
}
