package linkedList;

public class PrintIthNodeLL {
	
	public static void printIthNode(Node<Integer> head, int i){
		
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
			if(count == i) {
				System.out.println(temp.data);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		printIthNode(head,1);
	}

}
