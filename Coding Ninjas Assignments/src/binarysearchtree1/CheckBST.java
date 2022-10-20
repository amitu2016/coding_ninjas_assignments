package binarysearchtree1;

public class CheckBST {
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftMax = maximum(root.left);
		if(root.data <= leftMax) {
			return false;
		}
		
		int rightMin = minimum(root.right);
		if(root.data > rightMin) {
			return false;
		}
		
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		
		return isLeftBST && isRightBST;
		
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}

	private static int maximum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);
		
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(isBST(root));
	}

}
