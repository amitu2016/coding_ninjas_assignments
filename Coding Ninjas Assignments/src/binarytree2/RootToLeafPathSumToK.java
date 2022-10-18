package binarytree2;

public class RootToLeafPathSumToK {
	

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		String arr = "";
		rootToLeafPathsSumToK(root,k,arr);
	}

	private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String arr) {
		//Base Case
		if(root == null) {
			return;
		}
		
		//Storing value of root data
		int rootData = root.data;
		
		//Appending the root data value to string
		arr = arr+rootData+" ";
		
		//Returning string only if the last element satisfies the condition 
		//otherwise discard the string and continue
		if (k == rootData && root.left == null && root.right == null) {
			System.out.println(arr);
			return;
		}
		
		rootToLeafPathsSumToK(root.left, k - rootData, arr);
		rootToLeafPathsSumToK(root.right, k - rootData, arr);
		
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		rootToLeafPathsSumToK(root, 13);

	}

}
