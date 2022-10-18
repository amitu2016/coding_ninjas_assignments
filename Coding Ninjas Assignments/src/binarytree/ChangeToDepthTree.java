package binarytree;

public class ChangeToDepthTree {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		
		setDepth(root, 0);
	}
	
	public static void setDepth(BinaryTreeNode<Integer> root,int k) {
		if(root == null) {
			return;
		}
		
		root.data = k;
		
		setDepth(root.left, k+1);
		setDepth(root.right, k+1);
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		changeToDepthTree(root);
		BinaryTreeUse.printTreeDetailed(root);
	}

}
