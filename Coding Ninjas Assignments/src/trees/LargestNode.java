package trees;

public class LargestNode {

	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		
		int largestLeft = largest(root.left);
		int largesrRight = largest(root.right);
		
		return Math.max(root.data, Math.max(largestLeft, largesrRight));
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		 System.out.println("Largest Node = "+largest(root));

	}

}
