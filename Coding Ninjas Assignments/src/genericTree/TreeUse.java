package genericTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
	
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		int count = 0;
		
		if(root.data > x) {
			count++;
		}
		
		for (int i = 0; i < root.children.size(); i++) {
			int childCount = numNodeGreater(root.children.get(i),x);
			count += childCount;
		}
		return count;	

	}

	public static void printLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> pendingChildren = new LinkedList<>();
		pendingChildren.add(root);
		pendingChildren.add(null);

		while (!pendingChildren.isEmpty()) {
			TreeNode<Integer> front = pendingChildren.poll();
			if (front != null) {
				System.out.print(front.data+" ");
				for (int i = 0; i < front.children.size(); i++) {
					pendingChildren.add(front.children.get(i));
				}
			} else {
				System.out.println();
				if (!pendingChildren.isEmpty()) {
					pendingChildren.add(null);
				}
			}
		}

	}

	public static TreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = sc.nextInt();
		if (rootData == -1) {
			return null;
		}

		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);

		while (!pendingNodes.isEmpty()) {

			TreeNode<Integer> front = pendingNodes.poll();
			System.out.println("Enter no. of children for " + front.data);
			int childCount = sc.nextInt();

			for (int i = 1; i <= childCount; i++) {
				System.out.println("Enter the " + i + "th child of " + front.data);
				int childData = sc.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				front.children.add(child);
				pendingNodes.add(child);
			}

		}
		return root;
	}

	public static int sumOfAllNode(TreeNode<Integer> root) {
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int childSum = sumOfAllNode(root.children.get(i));
			sum += childSum;
		}
		return sum;
	}

	public static int numberOfNodes(TreeNode<Integer> root) {
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			int childCount = numberOfNodes(root.children.get(i));
			count += childCount;
		}
		return count;
	}

	public static void printTree(TreeNode<Integer> root) {
		// Special case not base case
		if (root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}
	
	public static int getHeight(TreeNode<Integer> root){
		 if(root == null) {
			 return 0;
		 }
		 
		 
		 int max = 0;
		 for (int i = 0; i < root.children.size(); i++) {
			int childHeight = getHeight(root.children.get(i));
			max = Math.max(max, childHeight);
		}
		
		 return 1 + max;
		 
	}
	
	public static void printPostOrder(TreeNode<Integer> root){
		if(root == null) {
			return;
		}
		
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			//System.out.print(root.children.get(i).data+" ");
			printPostOrder(child);
		}
		
		System.out.print(root.data+" ");
		
	}
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		for (int i = 0; i < root.children.size(); i++) {
			boolean present = checkIfContainsX(root.children.get(i), x);
			if(present) {
				return true;
			}
		}
		
		return false;
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		MaxSumNodeReturn ans = maxSumNodeHelper(root);
		return ans.node;
	}

	private static MaxSumNodeReturn maxSumNodeHelper(TreeNode<Integer> root) {
		if(root == null) {
			MaxSumNodeReturn ans = new MaxSumNodeReturn();
			ans.node = null;
			ans.totalSum = 0;
			return ans;
		}
		
		MaxSumNodeReturn res = new MaxSumNodeReturn();
		res.node = root;
		int sum = 0;
		for (int i = 0; i < root.children.size(); i++) {
			sum += root.children.get(i).data; 
		}
		res.totalSum = root.data + sum;
		
		for (int i = 0; i < root.children.size(); i++) {
			MaxSumNodeReturn smallans = maxSumNodeHelper(root.children.get(i));
			if(smallans.totalSum > res.totalSum) {
				res.totalSum = smallans.totalSum;
				res.node = smallans.node;
			}
		}
		return res;
	}


	public static void main(String[] args) {
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		node2.children.add(node5);

		// printTree(root);
		TreeNode<Integer> root = takeInput();
		printTree(root);
		int nodesCount = numberOfNodes(root);
		System.out.println(nodesCount);
		//System.out.println(sumOfAllNode(root));
		//System.out.println("Height :"+getHeight(root));
		printPostOrder(root);
	}

}
