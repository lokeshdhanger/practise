package trees;

public class RightViewOfBinaryTree {
	
	static Node root;
	static int currentLevel=0;
	public static void main(String[] args) {
		
		root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.right=new Node(6);
		
		System.out.println("right view:");
		rightView(root, 1);
		
	}
	
	public static void rightView(Node root, int level) {
		if (root==null) {
			return;
		}
		if (currentLevel<level) {
			System.out.println(root.data+" ");
			currentLevel=level;
		}
		rightView(root.right, level+1);
		rightView(root.left, level+1);
	}

}
