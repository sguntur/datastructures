package self.learning.datastructures.trie.test;

import org.junit.jupiter.api.Test;

import self.learning.datastructures.trie.Trie;

class TestTrie {

	Trie createExampleTrie() {
		Trie trie = new Trie();
		trie.insert("This");
		trie.insert("is");
		trie.insert("my");
		trie.insert("test case");
		return trie;
	}
	
	@Test
	void testInsert() {
		
		System.out.println("Trie="+createExampleTrie().toString());
		
	}
	
	@Test
	void testFind() {
		Trie trie = createExampleTrie();
		System.out.println(trie.find("my"));
		System.out.println(trie.find("test case"));
		System.out.println(trie.find("3"));
		System.out.println(trie.find("test"));
	}
	
	
	@Test
	void testDelete() {
		Trie trie = createExampleTrie();
		trie.delete("test");
		System.out.print(trie);
	}

}
