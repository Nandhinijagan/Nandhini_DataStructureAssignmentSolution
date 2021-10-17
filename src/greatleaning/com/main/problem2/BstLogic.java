package greatleaning.com.main.problem2;

public class BstLogic {
	// Function to to flatten the binary search tree into a skewed tree in increasing / decreasing order
		static void flattenSkewedTree(Node root, int order, Node headNode, Node prevNode ) {
			// Base Case
			if(root == null) {
				return;
			}
		
			// Condition to check the order in which the skewed tree to maintained
			if(order > 0) {
				flattenSkewedTree(root.right, order, headNode, prevNode);
			} else {
				flattenSkewedTree(root.left, order, headNode, prevNode);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;
			// Condition to check if the root Node of the skewed tree is not defined
			if(headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
		
			// Similarly recurse for the left / right subtree on the basis of the order required
			if (order > 0) {
				flattenSkewedTree(leftNode, order, headNode, prevNode);
			} else {
				flattenSkewedTree(rightNode, order, headNode, prevNode);
			}
		}
		
		// Function to traverse the right skewed tree using recursion
		static void traverseRightSkewed(Node root) {
			if(root == null) {
				return;
			}
			// Right skewed for ascending order
			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);	
		}
}
