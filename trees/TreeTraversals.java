package trees;

/**
*NOTE:
*  time complexity of all three inorder, preorder, postorder is same
*  i.e. O(n)
*
*
*/
public class TreeTraversals {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(6);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right=new Node(15);
		root.right.right=new Node(18);
		
		/**
		*in BST, inorder traversal gives nodes in decreasing order.
		*
		*
		*/
		inorder(root);
		System.out.println("\n");

		/**
		*preorder traversal used to:
		* 1. create copy of a tree
		* 2. get prefix expression on of an expression tree.
		*/
		preorder(root);
		System.out.println("\n");

		/**
		* postorder traversal is used to delete the tree.
		* used to get postfix expression of an expression tree.
		*
		*/
		postorder(root);
		
	}
	
	public static void inorder(Node root) {
		if (root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	
	public static void preorder(Node root) {
		if (root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);

	}
	
	public static void postorder(Node root) {
		if (root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}
