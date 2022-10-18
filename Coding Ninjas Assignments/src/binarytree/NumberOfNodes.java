package binarytree;

import java.util.Scanner;

public class NumberOfNodes {

	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
		
	}
	
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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		System.out.println("Number of Nodes = "+ numNodes(root));
	}

}
