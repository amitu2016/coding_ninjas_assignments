package trees2;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();

		pendingChildren.add(root);

		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();

			System.out.print(front.data + ": ");

			if (front.left != null) {
				System.out.print("L" + front.left.data+", ");
				pendingChildren.add(front.left);
			}else {
				System.out.print("L" +"-1"+",");
			}

			if (front.right != null) {
				System.out.print("R" + front.right.data);
				pendingChildren.add(front.right);
			}else {
				System.out.print("R" +"-1");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printLevelWise(root);
	}

}
