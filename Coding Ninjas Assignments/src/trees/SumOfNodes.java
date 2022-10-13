package trees;

public class SumOfNodes {

	public static int getSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftNodeSum = getSum(root.left);
		int rightNodeSum = getSum(root.right);
		return root.data + leftNodeSum + rightNodeSum;
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
		System.out.println("Sum = "+getSum(root));

	}

}
