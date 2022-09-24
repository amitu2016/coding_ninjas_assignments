package linkedList;

public class PalindromeLL {
	
	public static Boolean palindrome(Node<Integer> head) {
		if (head == null) {
			return true;
		}
		
		Node<Integer> mid = middle(head);
		Node<Integer> last = printReverse(mid);
		Node<Integer> curr = head;
		
		while (last != null) {
			if (last.data != curr.data) {
				return false;
			}
			
			last = last.next;
			curr = curr.next;
		}
		return true;
	}
	
	public static Node<Integer> middle(Node<Integer> head){
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> printReverse(Node<Integer> root) {
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
		return root;
	}


	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(3);
		Node<Integer> n2 = new Node<>(9);
		Node<Integer> n3 = new Node<>(1);
		Node<Integer> n4 = new Node<>(2);
		Node<Integer> n5 = new Node<>(9);
		Node<Integer> n6 = new Node<>(3);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
	System.out.println(palindrome(head));

	}

}
