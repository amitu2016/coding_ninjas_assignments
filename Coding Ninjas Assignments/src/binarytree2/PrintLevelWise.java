package binarytree2;

public class PrintLevelWise {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		int h = height(root);
		
		for (int i = 1; i <= h; i++) {
			printCurrentLevel(root, i);
			System.out.print(System.lineSeparator());
		}
	}

	private static void printCurrentLevel(BinaryTreeNode<Integer> root, int level) {
		if (root == null) {
			return;
		}
		
		if (level == 1) {
			System.out.print(root.data+ " ");
		}else if(level > 1) {
			printCurrentLevel(root.left, level -1);
			printCurrentLevel(root.right, level - 1);
		}
		
	}

	private static int height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if (lheight > rheight) {
				return lheight + 1;
			}else {
				return rheight + 1;
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printLevelWise(root);
	}

}
