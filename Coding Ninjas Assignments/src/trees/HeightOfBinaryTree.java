package trees;

public class HeightOfBinaryTree {
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int LeftHeight = height(root.left);
		
		int rightHeight = height(root.right);
		
		return 1 + Math.max(LeftHeight, rightHeight);
		
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		
		System.out.println("Height = "+height(root));
	}

}
