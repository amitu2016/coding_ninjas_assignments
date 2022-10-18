package binarytree;

public class IsNodePresent {
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	   
	    if(root == null) {
	    	return false;
	    }
		
	    if(root.data == x) {
	    	return true;
	    }
		
			
		return (isNodePresent(root.left, x) || isNodePresent(root.right, x));
		
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, false);
		System.out.println(isNodePresent(root, 5));

	}

}
