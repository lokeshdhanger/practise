package trees;

public class TreeTraversals {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(6);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right=new Node(15);
		root.right.right=new Node(18);
		
		inorder(root);
		System.out.println("\n");
		preorder(root);
		System.out.println("\n");
		postorder(root);
		
	}
	
	public static void inorder(Node root) {
		if (root==null) {
			return;
		}
		System.out.print(root.data+" ");
		inorder(root.left);
		inorder(root.right);
	}

	
	public static void preorder(Node root) {
		if (root==null) {
			return;
		}
		preorder(root.left);
		System.out.print(root.data+" ");
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
