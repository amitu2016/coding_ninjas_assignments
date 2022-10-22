package binarysearchtree2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NodeToRootPathBinaryTree {

	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
		//Base Case
		if(root == null) {
			return null;
		}
		
		//If data is found at root itself, add it to arraylist and return
		if(root.data == x) {
			ArrayList<Integer> path = new ArrayList<>();
			path.add(x);
			return path;
		}
		
		//Else traverse recursively at left subtree
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
		
		//If x is found at left subtree add it to arraylistt
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		//Else traverse at right subtree
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
		//If x is found add it to arraylist and return
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		//If x is not found anywhere, return null
		return null;
		
		
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		ArrayList<Integer> path = nodeToRootPath(root, 5);
		for(int i: path) {
			System.out.println(i);
		}
	}

}
