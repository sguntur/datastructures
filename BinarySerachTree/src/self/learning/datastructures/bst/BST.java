package self.learning.datastructures.bst;

import lombok.ToString;

@ToString
public class BST {
	Node root=null;
	
	public void insert(int value) {
		root = insertRecursive(value,root);
	}
	
	private Node insertRecursive(int value, Node current) {
		
		if(current==null) {
			return new Node(value);
		}
		
		if(current.getValue() < value) {
			// Right
			current.right = insertRecursive(value,current.getRight());
		}else if(current.getValue() > value) {
			//Left
			current.left = insertRecursive(value, current.getLeft());
		}else {
			return current;
		}
		
		return current;
	}
	
	public boolean find(int value) {
		return containsNode(value,root);
	}
	
	private boolean containsNode(int value, Node current) {
		if(current == null) {
			return false;
		}
		if(current.getValue() == value) {
			return true;
		}
		
		if(value < current.getValue()) {
			return containsNode(value,current.getLeft());
		}else if(value > current.getValue()){
			return containsNode(value, current.getRight());
		}
		return false;
	}
	
	public void delete(int value) {
		
	}
	
	public boolean isEmpty() {
		return root==null;
	}
}
