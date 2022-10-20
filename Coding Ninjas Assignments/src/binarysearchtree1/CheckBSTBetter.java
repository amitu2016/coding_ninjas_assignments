package binarysearchtree1;

public class CheckBSTBetter {

	public static IsBstReturn checkBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			IsBstReturn ans = new IsBstReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}

		IsBstReturn leftAns = checkBST(root.left);
		IsBstReturn rightAns = checkBST(root.right);

		int min = Math.min(root.data, Math.min(leftAns.minimum, rightAns.minimum));
		int max = Math.max(root.data, Math.max(leftAns.maximum, rightAns.maximum));

		boolean isBst = true;

		if (root.data <= leftAns.maximum) {
			isBst = false;
		}

		if (root.data > rightAns.minimum) {
			isBst = false;
		}

		if (!leftAns.isBst) {
			isBst = false;
		}

		if (!rightAns.isBst) {
			isBst = false;
		}
		
		IsBstReturn ans = new IsBstReturn(min, max, isBst);
		
		return ans;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		IsBstReturn ans = checkBST(root);
		System.out.println(ans.minimum);
		System.out.println(ans.maximum);
		System.out.println(ans.isBst);
	}

}
