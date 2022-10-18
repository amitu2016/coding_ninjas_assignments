package binarytree2;

public class MirrorBinaryTree {
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			return;
		}
		
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = RemoveLeafNodes.takeTreeInputBetter(true, 0, false);
		mirrorBinaryTree(root);
		RemoveLeafNodes.printTreeDetailed(root);
	}

}
