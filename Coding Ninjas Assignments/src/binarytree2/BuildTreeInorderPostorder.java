package binarytree2;

public class BuildTreeInorderPostorder {
	
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root = buildTreeHelper(postOrder, inOrder, 0, postOrder.length -1, 0, inOrder.length -1);
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int[] inOrder, int poSi, int poEi, int inSi, int inEi){
		//Base Case
		if (poEi < poSi) {
			return null;
		}
		
		int rootData = postOrder[poEi];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		
		int rootIndexInorder = -1;
		for (int i = inSi; i <= inEi; i++) {
			if (rootData == inOrder[i]) {
				rootIndexInorder = i;
				break;
			}
		}
		
		int leftInSi = inSi;
		int leftInEi = rootIndexInorder - 1;
		
		int leftPoSi = poSi;
		int leftSubTreeLength = leftInEi - leftInSi + 1;
		int leftPoEi = leftPoSi + (leftSubTreeLength - 1);
		
		int rightInSi = rootIndexInorder + 1;
		int rightInEi = inEi;
		
		int rightPoSi = leftPoEi + 1;
		int rightPoEi = poEi - 1;
		
		BinaryTreeNode<Integer> leftChild = buildTreeHelper(postOrder, inOrder, leftPoSi, leftPoEi, leftInSi, leftInEi);
		BinaryTreeNode<Integer> rightChild = buildTreeHelper(postOrder, inOrder, rightPoSi, rightPoEi, rightInSi, rightInEi);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}

	public static void main(String[] args) {

		int postorder[] = { 4, 5, 2, 6, 7, 3, 1 };
		int inorder[] = { 4, 2, 5, 1, 6, 3, 7 };

		BinaryTreeNode<Integer> root = buildTree(postorder, inorder);
		RemoveLeafNodes.printTreeDetailed(root);

	}

}
