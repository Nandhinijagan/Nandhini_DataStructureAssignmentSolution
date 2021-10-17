package greatleaning.com.main.problem2;

//Java implementation to flatten the
//binary search tree into a skewed
//tree in increasing / decreasing order

//Class of the node
class Node {
	int val;
	Node left, right;
	
	// Helper function that allocates a new node with the given data and NULL left and right pointers.
	Node(int item) {
		val = item;
		left = right = null;
	}
}

class BST {
	public Node node;
	static Node prevNode = null;
	static Node headNode = null;
	
	// Driver Code
	public static void main (String[] args) {
	//    50
	//	 / \
	// 	30  60
	// /  \	
	//10   40
		BST tree = new BST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.left.right= new Node(40);
	
		// Order of the Skewed tree can be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1
		int order = 0;
		BstLogic.flattenSkewedTree(tree.node, order, headNode, prevNode);
		System.out.println("The node values of BST in ascending order: ");
		BstLogic.traverseRightSkewed(headNode);
	}
}
