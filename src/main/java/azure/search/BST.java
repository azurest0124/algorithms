package azure.search;

public class BST {
	
//	private Node root;
	
	public Node makeTree(int[]arr) {
		return makeNode(arr, 0, arr.length-1);
	}
	
	private Node makeNode(int[]arr, int start, int end) {
		if(start>end) return null; 
		int mid = (start + end) /2; 
		Node node = new Node(arr[mid]); 
		node.left = makeNode(arr, 0, mid-1); 
		node.right = makeNode(arr, mid+1, end); 
		return node; 
	}
	
	public Node searchNode(Node rootNode, int searchValue) {
		if(rootNode == null) {
			System.out.println("not in array" ); 
			return null; 
		}
		if(rootNode.getData() == searchValue) {
			System.out.println("FOUND IT!!");
			return rootNode; 
		} else if (rootNode.getData() > searchValue) {
			System.out.println("("+rootNode.getData()+" > " + searchValue +") -> left search");
			rootNode = rootNode.left;
		} else {
			System.out.println("("+rootNode.getData()+"<" + searchValue +") -> right search");
			rootNode = rootNode.right; 
		}
		return searchNode(rootNode, searchValue); 
	}
	//TODO -ing
	public void insertNode(Node rootNode, int insertData) {
		if(searchNode(rootNode, insertData) != null) {
			System.out.println("already in array");
			return;
		};
	}
	
	//TODO
	public void removeNode(Node rootNode, int removeData) {
		
	}

}

class Node {
	Node left; 
	Node right; 
	int data; 
	Node(int data) {
		this.data = data;
		this.left = null; 
		this.right = null;
	}
	public int getData() {
		return this.data; 
	}
}
