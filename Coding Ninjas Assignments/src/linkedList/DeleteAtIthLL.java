package linkedList;

public class DeleteAtIthLL {

	public static Node<Integer> deleteNode(Node<Integer> head, int position) {

		Node<Integer> temp = head;
		Node<Integer> prevNode = null;
		int count = 0;
		if (position != 0) {
			while (count < position - 1) {
				count++;
				temp = temp.next;
				if (temp == null) {
					return head;
				}
			}

			if (temp == null) {
				return head;
			}

			prevNode = temp;
			prevNode.next = prevNode.next.next;

		} else {
			head = head.next;
		}

		return head;

	}

	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
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
		Node<Integer> res = deleteNode(head, 2);
		printLL(res);
	}

}
