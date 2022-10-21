package binarysearchtree1;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

class Pair{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}

public class BSTtoLL {
	
	
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Pair ans = helper(root);
		
		return ans.head;
		
	}

	
	private static Pair helper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			Pair output = new Pair();
			output.head = null;
			output.tail = null;
			return output;
		}
		
		Pair leftTree = helper(root.left);
		
		LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
		
		Pair rightTree = helper(root.right);
		
		Pair output = new Pair();
		
		if(leftTree.head != null) {
			output.head = leftTree.head;
			leftTree.tail.next = newNode;
		}else {
			output.head = newNode;
		}
		
		newNode.next = rightTree.head;
		
		if(rightTree.head != null) {
			output.tail = rightTree.tail;
		}else {
			output.tail = newNode;
		}
		return output;
	}


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		LinkedListNode<Integer> ans = constructLinkedList(root);
		
		while(ans != null) {
			System.out.print(ans.data+" ");
			ans = ans.next;
		}
	}

}
