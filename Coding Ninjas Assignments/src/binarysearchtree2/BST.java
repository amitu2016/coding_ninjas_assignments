package binarysearchtree2;


public class BST {

	private BinaryTreeNode<Integer> root;
	private int size;

	private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}

		if (root.data == x) {
			return true;
		}

		 if(x<root.data){
	            return isPresentHelper(root.left,x);
	        }else{
	            return isPresentHelper(root.right, x);
	        }
	}

	public boolean isPresent(int x) {
		return isPresentHelper(root, x);
	}

	public void insert(int x) {
		root = insertHelper(root, x);
		size++;
	}

	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x) {
		if (node == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(x);
			return newNode;
		}

		if (x >= node.data) {
			node.right = insertHelper(node.right, x);
		} else {
			node.left = insertHelper(node.left, x);
		}
		return node;
	}

	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteDataHelper(root, x);
		root = output.root;
		if (output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		
		int minLeft = minimum(root.left);
		int minRight = minimum(root.right);
		
		return Math.min(root.data, Math.min(minLeft, minRight));
	}

	private BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> node, int x) {
		if (node == null) {
			return new BSTDeleteReturn(null, false);
		}

		if (x < node.data) {
			BSTDeleteReturn leftOutput = deleteDataHelper(node.left, x);
			root.left = leftOutput.root;
			leftOutput.root = root;
			return leftOutput;
		}

		if (x > node.data) {
			BSTDeleteReturn rightOutput = deleteDataHelper(node.right, x);
			root.right = rightOutput.root;
			rightOutput.root = root;
			return rightOutput;
		}

		// if 0 child
		if (node.left == null && node.right == null) {
			return new BSTDeleteReturn(null, true);
		}

		// if only left child
		if (node.left != null && node.right == null) {
			return new BSTDeleteReturn(node.left, true);
		}

		// if only right child
		if (node.left == null && node.right != null) {
			return new BSTDeleteReturn(node.right, true);
		}
		
		//If both child are present
		int rightMin = minimum(node.right);
		root.data = rightMin;
		BSTDeleteReturn output = deleteDataHelper(node.right, rightMin);
		root.right = output.root;
		return new BSTDeleteReturn(node.right, true);

	}

	public int size() {
		return size;
	}

	public void printTree() {
		printTreeHelper(root);
	}

	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + ": ");

		if (node.left != null) {
			System.out.print("L" + node.left.data + ", ");
		}

		if (node.right != null) {
			System.out.print("R" + node.right.data);
		}

		System.out.println();

		printTreeHelper(node.left);
		printTreeHelper(node.right);

	}
}
