package trees;

public class PrintAtDepthK {
	
	
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		printAtDepthK(root, 2);
	}

}
