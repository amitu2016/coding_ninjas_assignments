package binarytree2;


public class InsertDuplicateNode {
	

	public static void insertDuplicateNode( BinaryTreeNode<Integer>root) {
		BinaryTreeNode<Integer> oldLeft;
		//Base Case
		if(root == null) {
			return;
		}
		
		//Recursion on subtrees
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		
		//Making duplicate of node and attaching it to left
		oldLeft = root.left;
		root.left = new BinaryTreeNode<Integer>(root.data);
		root.left.left = oldLeft;
			
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		insertDuplicateNode(root);
		RemoveLeafNodes.printTreeDetailed(root);
	}

}
