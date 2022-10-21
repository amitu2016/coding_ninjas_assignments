package binarysearchtree1;

public class ReplaceWithLargerNodeSum {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSumUtil(root, 0);
	}

	public static int replaceWithLargerNodesSumUtil(BinaryTreeNode<Integer> root, int sum) {
		if (root == null) {
			return 0;
		}

		int greaterSum = replaceWithLargerNodesSumUtil(root.right, sum);

		int temp = root.data;

		root.data = root.data + greaterSum + sum;

		int leftSum = replaceWithLargerNodesSumUtil(root.left, root.data);

		return temp + greaterSum + leftSum;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		replaceWithLargerNodesSum(root);
		PrintTreeDetailed.printTreeDetailed(root);

	}

}
