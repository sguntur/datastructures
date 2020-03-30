package self.learning.datastructures.bst;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value){
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
