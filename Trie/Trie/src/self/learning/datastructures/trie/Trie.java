package self.learning.datastructures.trie;

import lombok.ToString;

@ToString
public class Trie {
	private TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(String word) {
		TrieNode current = root;
		for(int i =0; i< word.length();i++) {
			current = current.getChildren().computeIfAbsent(word.charAt(i), c -> new TrieNode());
			current.setContent(word.charAt(i));
		}
		current.setIsWord(true);
	}
	
	public boolean find(String word) {
		TrieNode current = root;
		for(int i =0; i< word.length();i++) {
			current = current.getChildren().get(word.charAt(i));
			if(current ==null) {
				return false;
			}
		}

		return current.getIsWord();
	}
	
	public void delete(String word) {
		
	}
	
	
}
