package linkedList;

public class AppendLastNToFirst {
	
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		
		int count = length(head);
		
		//System.out.println(count);
		
		if(count != n && count > n) {
			
			int skip = count - n;
			Node<Integer> curr = head;
			Node<Integer> prev = null;
			Node<Integer> tempHead = head;
			
			while(skip > 0) {
				prev = curr;
				curr = curr.next;
				//System.out.println(skip);
				skip --;
			}
			
			prev.next = null;
			head = curr;
			
			while(curr.next!=null)
				curr = curr.next;
				curr.next = tempHead;
			}
			
			return head;
			
			
		}
		
	
		
	
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static int length(Node<Integer> head) {

		int count = 0;
		Node<Integer> temp = head;
		while (temp!=null) {
			count++;
			temp = temp.next;
		}

		return count;

	}
	
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(2);
		Node<Integer> n3 = new Node<>(3);
		Node<Integer> n4 = new Node<>(4);
		Node<Integer> n5 = new Node<>(5);
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Node<Integer> res =  appendLastNToFirst(head, 3);
		printLL(res);
	}

}
