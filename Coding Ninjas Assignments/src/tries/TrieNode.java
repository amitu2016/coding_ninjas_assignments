package tries;

public class TrieNode {	
	char data;
	boolean isTerminal;
	TrieNode children[];
	
	public TrieNode(char data) {
		this.data = data;
		isTerminal = false;
		children = new TrieNode[26];
	}
	
	
	
	
}
