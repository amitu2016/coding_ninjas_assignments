package trees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		System.out.println("Enter root data");
		Scanner sc = new Scanner(System.in);

		int rootData = sc.nextInt();

		if (rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
		pendingChildren.add(root);

		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();

			System.out.println("Enter left child of " + front.data);
			int left = sc.nextInt();

			if (left != -1) {
				BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(left);
				front.left = leftchild;
				pendingChildren.add(leftchild);
			}

			System.out.println("Enter right child of " + front.data);
			int right = sc.nextInt();

			if (right != -1) {
				BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>(right);
				front.right = rightchild;
				pendingChildren.add(rightchild);
			}

		}

		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		RemoveLeafNodes.printTreeDetailed(root);
	}

}
