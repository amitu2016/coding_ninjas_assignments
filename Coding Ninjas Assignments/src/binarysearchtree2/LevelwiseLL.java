package binarysearchtree2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class LevelwiseLL {

	public static ArrayList<LinkedListNode<Integer>> arr = new ArrayList<>();

	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
		// Base case
		if (root == null) {
			return null;
		}

		// Creating a queue to store the nodes to be printed
		Queue<BinaryTreeNode<Integer>> nodeToBePrinted = new LinkedList<BinaryTreeNode<Integer>>();

		// At the first level adding root data and null
		nodeToBePrinted.add(root);
		nodeToBePrinted.add(null);

		// creating head and tail pointers
		LinkedListNode<Integer> head = null, tail = null;

		// loop till queue becomes empty
		while (!nodeToBePrinted.isEmpty()) {

			// Pop out the front element from queue
			BinaryTreeNode<Integer> front = nodeToBePrinted.poll();
			//If front is null and queue is empty then break from loop
			//Else if queue is not empty this means one level is completed then reset head and tail pointers
			if (front == null) {
				if (nodeToBePrinted.isEmpty()) {
					break;
				} else {
					nodeToBePrinted.add(null);
					tail.next = null;
					tail = tail.next;
					head = null;
				}
			} else {
				
				// If head is null, create new LL Node and make head and tail point to it
				//Else create a new node and attach it to next of tail.
				if (head == null) {
					head = new LinkedListNode<Integer>(front.data);
					tail = head;
					arr.add(head);
				} else {
					tail.next = new LinkedListNode<Integer>(front.data);
					tail = tail.next;
				}
				// Add children of front element to queue
				
				if(front.left != null) {
					nodeToBePrinted.add(front.left);
				}
				
				if(front.right != null) {
					nodeToBePrinted.add(front.right);
				}
			}

		}
		return arr;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		ArrayList<LinkedListNode<Integer>> res = constructLinkedListForEachLevel(root);
		
		for (Iterator<LinkedListNode<Integer>> iterator = res.iterator(); iterator.hasNext();) {
			LinkedListNode<Integer> linkedListNode = (LinkedListNode<Integer>) iterator.next();
			System.out.println(linkedListNode.data);
		}

	}

}
