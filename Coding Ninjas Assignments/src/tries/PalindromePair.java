package tries;

import java.util.ArrayList;

public class PalindromePair {

	private TrieNode root;
	public int count;

	public PalindromePair() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word) {
		if (word.length() == 0) {
			root.isTerminal = true;
			return;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if (child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word) {
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if (word.length() == 0) {
			return true;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if (child == null) {
			return false;
		}

		return search(child, word.substring(1));

	}

	public boolean search(String word) {
		return search(root, word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}

		if (root.isTerminal) {
			System.out.println(word);
		}

		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}

	public void print() {
		print(this.root, "");
	}

	/* ..................... Palindrome Pair................... */

	public String reverse(String word) {

		String xString = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			xString += word.charAt(i);
		}
		return xString;

	}

	public boolean isPalindromePair(ArrayList<String> words) {

		//Iterate through the arraylist
		for (int i = 0; i < words.size(); i++) {
			
			//Reverse each string
			String string = reverse(words.get(i));

			PalindromePair suffixTrie = new PalindromePair();
			//Add all the string to create suffix trie
			for (int j = 0; j < string.length(); j++) {
				suffixTrie.add(string.substring(j));
			}
			
			// For each word, in suffix trie, find if its reverse is present
			for (String word : words) {
				if (suffixTrie.search(word)) {
					return true;
				}
			}

		}
		return false;

	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<>();
		String s1 = "abc";
		String s2 = "def";
		String s3 = "ghi";
		String s4 = "gfd";
		String s5 = "fjk";
		strings.add(s1);
		strings.add(s2);
		strings.add(s3);
		strings.add(s4);
		strings.add(s5);
		
		PalindromePair pair = new PalindromePair();
		
		System.out.println(pair.isPalindromePair(strings));
		
	}

}