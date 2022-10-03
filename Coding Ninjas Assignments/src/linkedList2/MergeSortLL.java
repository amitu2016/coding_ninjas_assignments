package linkedList2;

public class MergeSortLL {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> mid = mid(head);
		
		LinkedListNode<Integer> head1 = head;
		LinkedListNode<Integer> head2 = mid.next;
		mid.next = null;
		LinkedListNode<Integer> firstHead = mergeSort(head1);
		LinkedListNode<Integer> secondHead = mergeSort(head2);
		LinkedListNode<Integer> mergedHead = mergeTwoSortedLinkedLists(firstHead, secondHead);
		return mergedHead;
	}
	
	public static LinkedListNode<Integer> mid(LinkedListNode<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> fast = head;
		LinkedListNode<Integer> slow = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	} 
	
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
		LinkedListNode<Integer> n2 = new LinkedListNode<>(3);
		LinkedListNode<Integer> n3 = new LinkedListNode<>(6);
		LinkedListNode<Integer> n4 = new LinkedListNode<>(2);
		LinkedListNode<Integer> n5 = new LinkedListNode<>(1);
		LinkedListNode<Integer> n6 = new LinkedListNode<>(4);
		LinkedListNode<Integer> n7 = new LinkedListNode<>(15);
		LinkedListNode<Integer> n8 = new LinkedListNode<>(12);
		LinkedListNode<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		LinkedListNode<Integer> res = mergeSort(head);
		
		LinkedListNode<Integer> temp = res;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

}
