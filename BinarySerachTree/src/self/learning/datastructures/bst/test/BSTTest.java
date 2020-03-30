package self.learning.datastructures.bst.test;

import org.junit.jupiter.api.Test;

import self.learning.datastructures.bst.BST;

class BSTTest {

	
	BST createBST() {
		BST bst = new BST();
		bst.insert(826);
		bst.insert(248);
		bst.insert(258);
		bst.insert(85);
		bst.insert(7);
		bst.insert(357);
		bst.insert(6);
		return bst;
	}
	
	@Test
	void testBSTInsert() {
		BST bst = createBST();
		System.out.println(bst);
	}

	@Test
	void testBSTFind() {
		BST bst = createBST();
		System.out.println(bst.find(258));
		System.out.println(bst.find(25));
	}
	
}
