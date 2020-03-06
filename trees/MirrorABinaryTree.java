package trees;

/**
*
time complexity: O(n)
*
*/
public class MirrorABinaryTree {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(6);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right=new Node(15);
		root.right.right=new Node(18);
		
		inorder(root);
		mirror(root);
		System.out.println("\n");
		inorder(root);
		
	}
	
    // print tree data in inorder traversal
	public static void inorder(Node root) {
		if (root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
    // mirror the tree
	public static Node mirror(Node node) {
		if (node==null) {
			return node;
		}
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left=right;
		node.right=left;
				
		return node;
	}

}
