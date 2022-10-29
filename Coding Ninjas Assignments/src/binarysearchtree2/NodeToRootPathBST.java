package binarysearchtree2;

import java.util.ArrayList;

public class NodeToRootPathBST {

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int x) {
		// Base Case
		if (root == null) {
			return null;
		}

		// If data is found at root itself, add it to arraylist and return
		if (root.data == x) {
			ArrayList<Integer> path = new ArrayList<>();
			path.add(x);
			return path;
		}
		
		if(root.data <= x) {
			ArrayList<Integer> rightOutput = getPath(root.right, x);
			if(rightOutput != null) {
				rightOutput.add(root.data);
				return rightOutput;
			}
		}
		
		if(root.data > x) {
			ArrayList<Integer> leftOutput = getPath(root.left, x);
			
			//If x is found at left subtree add it to arraylistt
			if(leftOutput != null) {
				leftOutput.add(root.data);
				return leftOutput;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		ArrayList<Integer> path = getPath(root, 5);
		for(int i: path) {
			System.out.println(i);
		}

	}

}
