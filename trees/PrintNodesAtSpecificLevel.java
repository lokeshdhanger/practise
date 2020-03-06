package trees;

public class PrintNodesAtSpecificLevel {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(6);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right=new Node(15);
		root.right.right=new Node(18);
		root.right.right.right=new Node(25);
		
		int level=2;
		printLevelNodes(root, level);
		
	}
	
	public static void printLevelNodes(Node root, int level) {
		if (root==null) {
			return; 
		}
		if (level==0) {
			System.out.print(root.data+" ");
			return;
		} else {
			printLevelNodes(root.left, level-1);
			printLevelNodes(root.right, level-1);
		}
		
		
	}

}
