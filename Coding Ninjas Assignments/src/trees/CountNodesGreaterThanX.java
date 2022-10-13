package trees;

public class CountNodesGreaterThanX {
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		
		
		if (root.data > x) {
            return 1 + countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);
        } else {
            return countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);
        }
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		System.out.println("Count = "+countNodesGreaterThanX(root, 5));
	}

}
