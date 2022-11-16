package tries;

import java.util.ArrayList;

public class SuffixTrie {

	private TrieNode root;
	public int count;

	public SuffixTrie() {
		root = new TrieNode('\0');
	}
	
	public void add(String word) {
        if(insert(root,word)) {
            this.count++;
        }
    }
    private boolean insert(TrieNode root,String word) {
        if(word.length() == 0) {
            if(!root.isTerminal){
                root.isTerminal = true;
                return true;
            } 
            else{
                return false;
            }
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child==null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return insert(child, word.substring(1));
        
    }

	public boolean search(String word) {
		return search(root, word);
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

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
		
		//Iterating over all Strings one by one
		for (int i = 0; i < vect.size(); i++) {

			String string = vect.get(i);
			SuffixTrie suffixTrie = new SuffixTrie();
			//Adding all substrings in trie
			for (int j = 0; j < string.length(); j++) {
				suffixTrie.add(string.substring(j));
			}

			//Searching for the pattern in trie
			if (suffixTrie.search(pattern)) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		String s1 = "abcd";
		String s2 = "defz";
		String s3 = "ghik";
		String s4 = "ijgy";
		String s5 = "fjko";
		strings.add(s1);
		strings.add(s2);
		strings.add(s3);
		strings.add(s4);
		strings.add(s5);
		String pattern = "hiko";
		
		SuffixTrie trie = new SuffixTrie();
		
		System.out.println(trie.patternMatching(strings, pattern));
		
	}

}
