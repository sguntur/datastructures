package self.learning.datastructures.trie;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class TrieNode {
	private HashMap<Character, TrieNode> children=new HashMap<Character,TrieNode>();
	private Character content='#';
	private Boolean isWord=false;
}
