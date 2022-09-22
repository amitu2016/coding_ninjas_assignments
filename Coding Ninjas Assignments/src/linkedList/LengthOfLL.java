package linkedList;

public class LengthOfLL {
	
	public static int length(Node<Integer> head) {
		
		int count = 0;
        Node<Integer> temp = head;
        while(temp.data != -1){
            count++;
            temp = temp.next;
        }
        
        return count;
		
	}
	

	public static void main(String[] args) {
		
		Node<Integer> n1 = new Node<>(-1);
		//Node<Integer> n2 = new Node<>(20);
		//Node<Integer> n3 = new Node<>(-1);
		Node<Integer> head = n1;
		//n1.next = n2;
		//n2.next = n3;
		int length = length(head);
		System.out.println(length);
	}

}
