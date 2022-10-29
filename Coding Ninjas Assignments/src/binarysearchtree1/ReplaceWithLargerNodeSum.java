package binarysearchtree1;

public class ReplaceWithLargerNodeSum {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSumUtil(root, 0);
	}

	public static int replaceWithLargerNodesSumUtil(BinaryTreeNode<Integer> root, int sum) {
		if (root == null) {
			return 0;
		}

		int greaterSum = replaceWithLargerNodesSumUtil(root.right, sum);
        //System.out.println("Greater Sum = "+greaterSum);
		int temp = root.data;
		//System.out.println("Temp = "+ temp);
		root.data = root.data + greaterSum + sum;
		//System.out.println("Root.data = "+root.data);
		int leftSum = replaceWithLargerNodesSumUtil(root.left, root.data);
		//System.out.println("Left Sum = "+leftSum);
		//System.out.println("Final = "+temp + greaterSum + leftSum);
		return temp + greaterSum + leftSum;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		replaceWithLargerNodesSum(root);
		PrintTreeDetailed.printTreeDetailed(root);

	}

}
