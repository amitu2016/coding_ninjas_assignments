package linkedList2;


class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeSortedLL {
	
	 public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	        if(head1 == null) {
	        	return head2;
	        }
	        
	        if(head2 == null) {
	        	return head1;
	        }
	        
		 
		 	LinkedListNode<Integer> t1 = head1, t2 = head2;
	        LinkedListNode<Integer> head = null, tail = null;
	        	        
	        // Deciding head of the merged LL
	        if(t1.data <= t2.data) {
	        	head = t1;
	        	tail = t1;
	        	t1 = t1.next;
	        }else {
	        	head = t2;
	        	tail = t2;
	        	t2 = t2.next;
	        }	
	        
	        while(t1 != null && t2 != null) {
	        	
	        	if(t1.data <= t2.data) {
	        		tail.next = t1;
	        		tail = t1;
	        		t1 = t1.next;
	        	}else {
	        		tail.next = t2;
	        		tail = t2;
	        		t2 = t2.next;
	        	}
	        	
	        	
	        }
	        
	        // If one of the list is not exhausted
	        
	        if(t1 != null) {
        		tail.next = t1;
        	}else {
        		tail.next = t2;
        	}
        	
	       return head;
	    }

	public static void main(String[] args) {
		LinkedListNode<Integer> n1 = new LinkedListNode<>(5);
//		LinkedListNode<Integer> n2 = new LinkedListNode<>(3);
//		LinkedListNode<Integer> n3 = new LinkedListNode<>(5);
		LinkedListNode<Integer> n4 = new LinkedListNode<>(1);
		LinkedListNode<Integer> n5 = new LinkedListNode<>(2);
		LinkedListNode<Integer> n6 = new LinkedListNode<>(4);
//		LinkedListNode<Integer> n7 = new LinkedListNode<>(12);
//		LinkedListNode<Integer> n8 = new LinkedListNode<>(15);
		LinkedListNode<Integer> head1 = n1;
//		n1.next = n2;
//		n2.next = n3;
		LinkedListNode<Integer> head2 = n4;
		n4.next = n5;
		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
		
		LinkedListNode<Integer> res = mergeTwoSortedLinkedLists(head1, head2);
		
		LinkedListNode<Integer> temp = res;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

}
