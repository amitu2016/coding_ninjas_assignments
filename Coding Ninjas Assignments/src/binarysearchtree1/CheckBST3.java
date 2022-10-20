package binarysearchtree1;

public class CheckBST3 {

	public static boolean isBST(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if (root == null) {
			return true;
		}

		if (root.data < minRange || root.data > maxRange) {
			return false;
		}

		boolean isLeftWithinRange = isBST(root.left, minRange, root.data - 1);
		boolean isRightWithinRange = isBST(root.right, root.data, maxRange);

		return isLeftWithinRange && isRightWithinRange;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(isBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE));
	}

}
