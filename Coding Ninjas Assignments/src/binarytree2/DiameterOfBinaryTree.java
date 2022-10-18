package binarytree2;

public class DiameterOfBinaryTree {

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int diameter = leftHeight + rightHeight;
		
		int leftDiameter = diameterOfBinaryTree(root.left);
		int rightDiameter = diameterOfBinaryTree(root.right);
		
		return 1 + Math.max(Math.max(leftDiameter, rightDiameter), diameter);
		
	}
	
	private static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = RemoveLeafNodes.takeTreeInputBetter(true, 0, false);
		int result = diameterOfBinaryTree(root);
		
		System.out.println("Diameter = "+result);

	}

}
