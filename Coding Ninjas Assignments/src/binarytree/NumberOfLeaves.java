package binarytree;

public class NumberOfLeaves {
	
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return numLeaves(root.left) + numLeaves(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		
		System.out.println("No. of leafs :"+numLeaves(root));
	}

}
