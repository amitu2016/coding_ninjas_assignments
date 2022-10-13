package trees;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeTreeInput() {
		
		System.out.println("Enter Root Data :");
		Scanner sc = new Scanner(System.in);
		Integer rootData = sc.nextInt();
		
		
		if (rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
	    BinaryTreeNode<Integer> rightChild = takeTreeInput();
	    
	    root.left = leftChild;
	    root.right = rightChild;
		
		return root;
	} 
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.data +": ");
		
		if (root.left != null) {
			System.out.print("L"+root.left.data + ", ");
		}
		
		if (root.right != null) {
			System.out.print("R"+root.right.data);
		}
		
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
		
	}
	
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.data);
		
		printTree(root.left);
		printTree(root.right);
		
	}

	public static void main(String[] args) {
//		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		//printTree(root);
//		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//		
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//		
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
//		
//		printTreeDetailed(root);
		
		BinaryTreeNode<Integer> root = takeTreeInput();
		
		printTreeDetailed(root);

	}

}
