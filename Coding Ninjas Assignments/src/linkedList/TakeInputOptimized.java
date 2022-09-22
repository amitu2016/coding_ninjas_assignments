package linkedList;

import java.util.Scanner;

public class TakeInputOptimized {

	//O(n) solution
	public static Node<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);

		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;
		while (data != -1) {
			Node<Integer> current = new Node<Integer>(data);

			// Setting first node as head node otherwise ending new node to tail
			if (head == null) {
				head = current;
				tail = current;
			} else {
				// Attaching the new node to tail node
				tail.next = current;

				// making new node as tail
				tail = current;
			}
			
			data = sc.nextInt();

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
		Node<Integer> head = takeInput();
		printLL(head);
	}

}
