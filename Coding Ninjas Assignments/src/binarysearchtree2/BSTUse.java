package binarysearchtree2;

public class BSTUse {

	public static void main(String[] args) {
		BST b = new BST();

		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);

		b.printTree();

		System.out.println("is 5 present? "+b.isPresent(5));
		System.out.println(b.size());
		System.out.println(b.deleteData(5)); 
		System.out.println(b.size());
		System.out.println("is 5 present? "+b.isPresent(5));

	}

}
