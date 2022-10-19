package binarysearchtree1;

public class SearchInBST {
	
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return false;
		}
		
		boolean leftResult = false;
		boolean rightResult = false;
		
		if(root.data == k) {
			return true;
		}else if(root.data > k) {
			leftResult = searchInBST(root.left, k);
		}else if(root.data < k) {
			rightResult = searchInBST(root.right, k);
		}
		
		return (leftResult || rightResult); 
		
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(searchInBST(root, 9));
	}

}
