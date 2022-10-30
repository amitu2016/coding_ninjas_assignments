package binarysearchtree2;

public class BST {
	
	private BinaryTreeNode<Integer> root;
	private int size;
	
	public static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		if(root.data < x) {
			return isPresentHelper(root.right, x);
		}else {
			return isPresentHelper(root.left, x);
		}
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root, x);
	}
	
	

	public void insert(int x) {
		
	}
	
	public boolean deleteData(int x) {
		return false;
	}
	
	public int size() {
		return size;
	}

	public void printTree() {
		printTreeHelper(root);
	}

	public static void printTreeHelper(BinaryTreeNode<Integer> node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.data+": ");
		
		if(node.left != null) {
			System.out.println("L"+node.left.data+", ");
		}
		
		if (node.right != null) {
			System.out.println("R"+node.right.data);
		}
		
		System.out.println();
		
		printTreeHelper(node.left);
		printTreeHelper(node.right);
		
	}
}
