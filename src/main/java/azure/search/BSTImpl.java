package azure.search;

public class BSTImpl {

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,9,10}; 
		BinarySearchTree bst = new BinarySearchTree(); 
		
		bst.makeTree(arr);
		bst.insertNode(bst.root, 10);
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

class BinarySearchTree{
	Node root = null; 
	public void makeTree(int[]arr) {
		root = makeNode(arr, 0, arr.length-1);
	}
	
	public Node makeNode(int[]arr, int start, int end) {
		if(start>end) return null; 
		int mid = (start + end) /2; 
		Node node = new Node(arr[mid]); 
		node.left = makeNode(arr, 0, mid-1); 
		node.right = makeNode(arr, mid+1, end); 
		return node; 
	}
	
	public Node searchNode(Node rootNode, int searchValue) {
		if(rootNode == null) {
			System.out.println("===VALUE DOES NOT EXIST===" ); 
			return null; 
		}
		if(rootNode.getData() == searchValue) {
			System.out.println("===Value found !!===");
			return rootNode; 
		} else if (rootNode.getData() > searchValue) {
			System.out.println("Node value ["+rootNode.getData()+"] is bigger than " + searchValue);
			rootNode = rootNode.left;
		} else {
			System.out.println("Node value ["+rootNode.getData()+"] is smaller than " + searchValue);
			rootNode = rootNode.right; 
		}
		return searchNode(rootNode, searchValue); 
	}
	
	public void insertNode(Node rootNode, int insertData) {
		if(searchNode(rootNode, insertData) != null) {
			System.out.println("[" + insertData + "] already exists");
			return;
		};
		
	}
}