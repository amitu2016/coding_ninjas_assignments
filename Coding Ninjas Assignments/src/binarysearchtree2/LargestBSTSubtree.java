package binarysearchtree2;

import binarysearchtree1.BinaryTreeNode;
import binarysearchtree1.TakeInputLevelWise;

public class LargestBSTSubtree {

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		LargestBSTReturn ans = largestBSTSubtreeHelper(root);
		return ans.height;
	}

	private static LargestBSTReturn largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new LargestBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
		}

		LargestBSTReturn leftAns = largestBSTSubtreeHelper(root.left);
		LargestBSTReturn rightAns = largestBSTSubtreeHelper(root.right);

		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		int height = 0;

		boolean isBst = true;

		if (root.data <= leftAns.max) {
			isBst = false;
		}

		if (root.data > rightAns.min) {
			isBst = false;
		}

		if (!leftAns.isBst) {
			isBst = false;
		}

		if (!rightAns.isBst) {
			isBst = false;
		}
		
		if(isBst) {
			height = Math.max(leftAns.height , rightAns.height) + 1;
		}else {
			height = Math.max(leftAns.height , rightAns.height);
		}
		
		LargestBSTReturn ans = new LargestBSTReturn(min, max, isBst, height);

		return ans;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		LargestBSTReturn ans = largestBSTSubtreeHelper(root);
		System.out.println(ans.max);
		System.out.println(ans.min);
		System.out.println(ans.isBst);
		System.out.println(ans.height);
	}

}
