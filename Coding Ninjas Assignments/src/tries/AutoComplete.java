package tries;

import java.util.ArrayList;


public class AutoComplete {
	private TrieNode root;
	public int count;

	public AutoComplete() {
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

	public void autoComplete(ArrayList<String> input, String word) {

		int i = 0;
		//Adding all the Strings to trie node
		while (i < input.size()) {
			String a = input.get(i);
			add(root, a);
			i++;
		}
		//If trie is empty then return
		if (root == null || root.childCount == 0) {
			return;
		}
		
		//Find if the word is present in trie. If present, return root
		TrieNode a = findword(root, word);
		String output = "";
		
		//Find all matching words
		allwords(a, word, output);

	}

	public void allwords(TrieNode root, String word, String output) {
		//Base Case
		if (root == null) {
			return;
		}

		//In this case this is leaf node
		if (root != null && root.childCount == 0) {
			if (output.length() > 0) {
				System.out.println(word + output);
			}
			return;
		}
		
		//In this case it is terminating, hince it represent a word
		if (root != null && root.isTerminal == true) {
			System.out.println(word + output);
		}

		//Calling recursion for finding all possible outputs
		for (int i = 0; i < root.children.length; i++) {
			if (root.children[i] != null) {
				String ans = output + root.children[i].data;
				allwords(root.children[i], word, ans);
			}
		}
	}

	public TrieNode findword(TrieNode root, String word) {
		if (word.length() == 0) {
			return root;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null) {
			return null;
		}
		return findword(child, word.substring(1));
	}
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		String s1 = "noted";
		String s2 = "notification";
		String s3 = "notes";
		String s4 = "this";
		String s5 = "that";
		strings.add(s1);
		strings.add(s2);
		strings.add(s3);
		strings.add(s4);
		strings.add(s5);
		String word = "th";
		AutoComplete auto = new AutoComplete();
		auto.autoComplete(strings, word);
	}

}
