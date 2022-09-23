package linkedList;

public class FindNodeInLL {
	
	public static int findNode(Node<Integer> head, int n) {
		int count = 0;
		Node<Integer> temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
			if(temp!= null && temp.data == n) {
				return count;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		int res = findNode(head, 0);
		System.out.println(res);
	}

}
