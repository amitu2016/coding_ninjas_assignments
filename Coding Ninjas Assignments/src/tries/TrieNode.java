package tries;

public class TrieNode {	
	char data;
	boolean isTerminal;
	TrieNode children[];
	int childCount;
	
	public TrieNode(char data) {
		this.data = data;
		isTerminal = false;
		children = new TrieNode[26];
		childCount = 0;
	}
	
	
	
	
}
