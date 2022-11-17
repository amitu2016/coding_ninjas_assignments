package tries;

public class TrieUse {

	public static void main(String[] args) {
		Trie t = new Trie();
		
		t.add("AMIT");
		t.add("KUMAR");
		t.add("UPADHYAY");
		
		System.out.println(t.search("AMIT"));
		
		t.remove("AMIT");
		
		System.out.println(t.search("AMIT"));
	}

}
