package binarysearchtree2;

import java.util.HashSet;

import binarysearchtree1.BinaryTreeNode;
import binarysearchtree1.TakeInputLevelWise;

public class PairSumBST {
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		HashSet<Integer> set = new HashSet<>();
	    printNodesSumHelper(root, s, set);
	}

	private static boolean printNodesSumHelper(BinaryTreeNode<Integer> root, int s, HashSet<Integer> set) {
		if(root == null) {
			return false;
		}
		
		if(printNodesSumHelper(root.left, s, set)) {
			return true;
		}
		
		if(set.contains(s - root.data)) {
			System.out.println((s -root.data)+" "+root.data);
		}else {
			set.add(root.data);
		}
		
		return printNodesSumHelper(root.right, s, set);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printNodesSumToS(root, 12);
	}

}
