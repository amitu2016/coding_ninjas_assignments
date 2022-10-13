package trees;

import java.util.Scanner;

public class TreeTraversal {
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
			
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void InOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);	
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
		System.out.println("Preorder");
		preOrder(root);
		System.out.println();
		
		System.out.println("Postorder");
		postOrder(root);
		System.out.println();
		
		System.out.println("Inorder");
		InOrder(root);
	}

}
