package trees2;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWiseTraversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
		pendingChildren.add(root);
		
		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();

			if (front.left != null && front.right != null) {
				System.out.println(front.data);
			}
			
			if (front.left != null) {
				System.out.print(front.left.data+" ");
				pendingChildren.add(front.left);
			}

			if (front.right != null) {
				System.out.print(front.right.data);
				pendingChildren.add(front.right);
			}
			System.out.println();
		}

		
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printLevelWise(root);
	}

}
