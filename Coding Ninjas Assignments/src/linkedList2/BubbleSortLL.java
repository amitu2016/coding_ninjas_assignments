package linkedList2;

public class BubbleSortLL {
	
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		if(head == null) {
			return head;
		}
		
		if(head != null) {
			LinkedListNode<Integer> current = null,
			        new_head = null,
			        move_node = null,
			        prev = null;
			
			
			  while (head != null) {
			        prev = null;
			        current = head;
			        move_node = head;
			        while (current != null) {
			          //When current node value is grater than previous node
			          if (current.next != null && current.next.data > move_node.data) {
			            //Swap node values
			            move_node = current.next;
			            prev = current;
			          }
			          current = current.next;
			        }
			        if (move_node == head) {
			          head = (head).next;
			        }
			        if (prev != null) {
			          prev.next = move_node.next;
			        }
			        move_node.next = new_head;
			        new_head = move_node;
			      }
			      //make new head
			      head = new_head;
		}
		return head;
	}
	
	public static void printRecursive(LinkedListNode<Integer> head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data+" -> ");
		printRecursive(head.next);
		
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> n1 = new LinkedListNode<>(5);
		LinkedListNode<Integer> n2 = new LinkedListNode<>(1);
		LinkedListNode<Integer> n3 = new LinkedListNode<>(32);
		LinkedListNode<Integer> n4 = new LinkedListNode<>(10);
		LinkedListNode<Integer> n5 = new LinkedListNode<>(20);
		LinkedListNode<Integer> n6 = new LinkedListNode<>(78);
		LinkedListNode<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		System.out.println("Linked list before sorting");
		printRecursive(head);
		System.out.println();
		LinkedListNode<Integer> res = bubbleSort(head);
		System.out.println("Linked list after sorting");
		printRecursive(res);
	}

}
