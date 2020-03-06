package trees;

public class HightOfBinaryTree {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(6);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right=new Node(15);
		root.right.right=new Node(18);
		root.right.right.right=new Node(25);
		
		System.out.println(height(root)); 
	}
	
	public static int height(Node root) {
		if (root==null) {
			return 0;			
		}
		int left = height(root.left);
		int right = height(root.right);
		int max = Math.max(left, right)+1;
		
		return max;
	}

}
