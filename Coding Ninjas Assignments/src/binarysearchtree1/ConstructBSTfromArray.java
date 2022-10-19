package binarysearchtree1;

public class ConstructBSTfromArray {
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		int start = 0;
		int end = n - 1;
		BinaryTreeNode<Integer> root = SortedArrayToBSTUtil(arr, start, end);
		return root;
	}


	private static BinaryTreeNode<Integer> SortedArrayToBSTUtil(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		
		root.left = SortedArrayToBSTUtil(arr, start, mid -1);
		root.right = SortedArrayToBSTUtil(arr, mid + 1, end);
		
		return root;
	}


	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = 7;
		BinaryTreeNode<Integer> root = SortedArrayToBST(arr, n);
		PrintTreeDetailed.printTreeDetailed(root);
	}

}
