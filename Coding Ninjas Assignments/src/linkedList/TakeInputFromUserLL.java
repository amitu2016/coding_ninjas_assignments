package linkedList;

import java.util.Scanner;

public class TakeInputFromUserLL {
	
	//O(n^2) Solution
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		
		int data = sc.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> current = new Node<Integer>(data);
			
			//Setting first node as head node otherwise ending new node to tail
			if(head == null) {
				head = current;
			}else {
				Node<Integer> tail = head;
				
				// Traversing to last node of LL
				while(tail.next!=null) {
					tail = tail.next;
				}
				
				// connect the last node to current node
				tail.next = current;
			}
			
			data = sc.nextInt();
			
		}
		
		return head;
		
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLL(head);
	}

}
