package linkedList;

public class ReverseLinkedLL {
	
	public static void printReverse(Node<Integer> root) {
		Node<Integer> curr = root;
		Node<Integer> next = null;
		Node<Integer> prev = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		root = prev;
		
		Node<Integer> temp = root;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		
		printReverse(head);

	}

}
