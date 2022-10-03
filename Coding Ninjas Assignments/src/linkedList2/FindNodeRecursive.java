package linkedList2;

public class FindNodeRecursive {
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	
		
		int ans = findNode(head, n, 0);
		return ans;
    	
	}
	
	public static int findNode(LinkedListNode<Integer> head, int n, int pos) {
		if(head == null) {
    		return -1;
    	}
		
		if(head.data == n) {
			return pos;
		}
		
		int res = findNode(head.next, n, pos+1);
		return res;
	}
	

	public static void main(String[] args) {
		

	}

}
