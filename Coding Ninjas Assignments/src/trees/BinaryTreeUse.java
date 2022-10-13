package trees;

import java.util.Scanner;

public class BinaryTreeUse {
	
public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
		
	if (isRoot) {
		System.out.println("Enter Root Data:");
	}else {
		if (isLeft) {
			System.out.println("Enter left child of "+parentData);
		}else {
			System.out.println("Enter right child of "+parentData);
		}
	}
	
	
	
	
	
		Scanner sc = new Scanner(System.in);
		Integer rootData = sc.nextInt();
		
		
		if (rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
	    BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
	    
	    root.left = leftChild;
	    root.right = rightChild;
		
		return root;
	} 
	
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
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
		
	}
	
	public static int getSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftNodeSum = getSum(root.left);
		int rightNodeSum = getSum(root.right);
		return root.data + leftNodeSum + rightNodeSum;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.data);
		
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
			
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	public static void InOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);	
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
		
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
//		
//		printTreeDetailed(root);
//		
//		System.out.println("No. of Nodes: "+numNodes(root));
//		
//		System.out.println("Sum = "+getSum(root));
		System.out.println("Inorder Traversal:");
		InOrder(root);
		
		System.out.println("Preorder Traversal:");
		preOrder(root);
		
		System.out.println("Postorder Traversal:");
		postOrder(root);

	}

}
