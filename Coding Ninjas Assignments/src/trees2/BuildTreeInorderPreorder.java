package trees2;

public class BuildTreeInorderPreorder {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		int preOrderIndex = 0;
		int n = preOrder.length;
		BinaryTreeNode<Integer> ans = solve(inOrder, preOrder, preOrderIndex, 0, inOrder.length - 1, n);
		return ans;

	}

	private static BinaryTreeNode<Integer> solve(int[] inOrder, int[] preOrder, int preOrderIndex, int inOrderStart,
			int inOrderEnd, int n) {
		if (preOrderIndex >= n || inOrderStart > inOrderEnd) {
			return null;
		}

		int rootData = preOrder[preOrderIndex++];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int position = findPosition(inOrder, rootData, n);
		root.left = solve(inOrder, preOrder, preOrderIndex, inOrderStart, position - 1, n);
		root.right = solve(inOrder, preOrder, preOrderIndex, position + 1, inOrderEnd, n);
		return root;
	}

	private static int findPosition(int[] inOrder, int rootData, int n) {
		for (int i = 0; i < n; i++) {
			if (inOrder[i] == rootData) 
				return i;
			
		}
		return -1;
	}

	public static void main(String[] args) {

		int preorder[] = { 1, 2, 4, 5, 3, 6, 7 };
		int inorder[] = { 4, 2, 5, 1, 6, 3, 7 };

		BinaryTreeNode<Integer> root = buildTree(preorder, inorder);
		RemoveLeafNodes.printTreeDetailed(root);
	}

}
