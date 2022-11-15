package tries;

public class Trie {

	public TrieNode root;

	public Trie() {
		root = new TrieNode('\0');
	}

	public void add(String word) {
		addHelper(root, word);
	}

	private void addHelper(TrieNode root, String word) {
		// Base Case
		if (word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		//Finding if the alphabet already present in root's children array
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];

		//If not present, create a node and add it to roots children array
		if (child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount ++;
		}

		//Recursively traverse the array
		addHelper(child, word.substring(1));

	}

	public boolean search(String word) {
		
		return searchHelper(root,word);
		
	}

	

	private boolean searchHelper(TrieNode root, String word) {
		
		if (word.length() == 0) {
			return root.isTerminal;
		}
		
		
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		
		if (child == null) {
			return false;
		}
		
		return searchHelper(child, word.substring(1));
	}

	public void remove(String word) {
		removeHelper(root,word);
	}

	private void removeHelper(TrieNode root, String word) {
		
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		
		if (child == null) {
			return;
		}
		
		removeHelper(child, word.substring(1));
		if (!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount --;
		}
	}

}
