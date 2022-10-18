package binarytree;

public class NodeWithoutSibling {
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right != null) {
			System.out.println(root.right.data);
		}else if(root.left != null && root.right == null) {
			System.out.println(root.left.data);
		}
		
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
		
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		printNodesWithoutSibling(root);
	}

}
