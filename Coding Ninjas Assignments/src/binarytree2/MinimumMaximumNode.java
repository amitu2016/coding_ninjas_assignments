package binarytree2;

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}


public class MinimumMaximumNode {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		int maximum = findMax(root);
		int minimum = findMin(root);
		
		Pair<Integer, Integer> result = new Pair<Integer, Integer>(minimum, maximum);
		return result;
	}
	
	private static int findMin(BinaryTreeNode<Integer> root) {
		if(root == null)	
		return Integer.MAX_VALUE;;
		
		int res = root.data;
		int lres = findMin(root.left);
		int rres = findMin(root.right);
		
		if(lres < res)
			res = lres;
		
		if(rres < res)
			res = rres;
		
		return res;
	}

	private static int findMax(BinaryTreeNode<Integer> root) {
		if(root == null)
		return Integer.MIN_VALUE;
		
		int res = root.data;
		int lres = findMax(root.left);
		int rres = findMax(root.right);
		
		if(lres > res)
			res = lres;
		
		if(rres > res)
			res = rres;
		
		return res;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		Pair<Integer, Integer> result = getMinAndMax(root);
		System.out.println("Maximum = "+result.maximum);
		System.out.println("Minimum = "+result.minimum);
	}

}
