package azure.search;

import org.junit.Test;

public class BSTTest {

	@Test
	public void BST () {
		int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13}; 
		BST bst = new BST(); 
		Node rootNode = bst.makeTree(arr);
		bst.searchNode(rootNode, 14); 
	}
}
