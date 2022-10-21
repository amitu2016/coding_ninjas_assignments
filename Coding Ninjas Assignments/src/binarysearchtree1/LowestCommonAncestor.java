package binarysearchtree1;

public class LowestCommonAncestor {

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null) {
			return -1;
		}
		
		int curr = root.data;
		
		if(curr < a && curr < b) {
			getLCA(root.right, a, b);
		}
		
		if(curr > a && curr > b) {
			getLCA(root.left, a, b);
		}
		return root.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
