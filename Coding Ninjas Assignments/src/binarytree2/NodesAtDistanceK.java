package binarytree2;

public class NodesAtDistanceK {


	public static int printElementsAtKDistance(BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> targetNode, int k) {
	    if (node == null || targetNode == null || k < 0) {
	      return -1;
	    }

	    return printElementsAtKDistanceUtil(node, targetNode, k);
	  }
	
	  public static int printElementsAtKDistanceUtil(BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> targetNode, int k) {
	    if(node == null) {
	      return -1;
	    }
	  
	    if(node == targetNode) {
	      printNodesAtKDistanceFromParent(node, k);
	      return 0;
	    }
	    
	    int leftDist = printElementsAtKDistanceUtil(node.left, targetNode, k);
	    
	    if(leftDist != -1) {
	      if(leftDist + 1 == k) {
	        System.out.print(node.data + " ");
	      } else {
	        printNodesAtKDistanceFromParent(node.right, k - 2 - leftDist);
	      }
	      
	      return leftDist + 1; 
	    }
	    
	    int rightDist = printElementsAtKDistanceUtil(node.right, targetNode, k);
	    
	    if(rightDist != -1) {
	      if(rightDist + 1 == k) {
	        System.out.print(node.data + " ");
	      } else {
	        printNodesAtKDistanceFromParent(node.left, k - 2 - rightDist);
	      }
	      
	      return rightDist + 1; 
	    }
	    
	    return -1;
	  }

	  public static void printNodesAtKDistanceFromParent(BinaryTreeNode<Integer> node, int k) {
	    if (node == null) {
	      return;
	    }

	    if (k == 0) {
	      System.out.print(node.data + " ");
	    }

	    printNodesAtKDistanceFromParent(node.left, k - 1);
	    printNodesAtKDistanceFromParent(node.right, k - 1);
	  }

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		int elements = printElementsAtKDistance(root, root.left, 2);
		System.out.println(elements);
	}

}
