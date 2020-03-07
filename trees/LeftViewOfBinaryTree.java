package trees;

/**
 * time complexity: O(n)
 * space complexity: O(n)
 * @author xarvis
 *
 */
public class LeftViewOfBinaryTree {
	
	static Node root;
	static int MAX_LEVEL=0;

	public static void main(String[] args) {
		
		root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.right=new Node(6);
		
		System.out.println("left view:");
		leftView(root, 1);
		
	}
	
	public static void leftView(Node root, int level) {
		if (root==null) {
			return;
		}
		
		if (MAX_LEVEL<level) {
			System.out.print(root.data+" ");
			MAX_LEVEL=level;
		}
		leftView(root.left, level+1);
		leftView(root.right, level+1);
	}
}
