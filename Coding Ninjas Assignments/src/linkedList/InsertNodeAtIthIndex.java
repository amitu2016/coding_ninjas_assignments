package linkedList;

public class InsertNodeAtIthIndex {
	
	public static Node<Integer> insertNode(Node<Integer> head, int data, int position){
		
		Node<Integer> currentNode =  new Node<Integer>(data);
		Node<Integer> temp = head;
		Node<Integer> prevNode = null;
		Node<Integer> nextNode = null;
		int count = 0;
		if(position != 0) {
			while(count < position - 1) {
				count++;
				temp = temp.next;
				if(temp == null) {
					return head;
				}
			}
			
			if(temp == null) {
				return head;
			}

			prevNode = temp;
			nextNode = prevNode.next;
			currentNode.next = nextNode;
			prevNode.next = currentNode;
		}else {
			currentNode.next = head;
			head = currentNode;
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
		Node<Integer> res = insertNode(head, 50, 50);
		printLL(res);
	}

}
