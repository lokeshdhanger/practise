package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ttime complexity: O(n)
 * 
 * @author xarvis
 *
 */
public class RightViewBinaryTreeIterative {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.right=new Node(6);
		
		rightView();
	}
	
	public static void rightView() {
		
		if (root==null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while (!q.isEmpty()) {
			
			int size = q.size();
			
			for (int i = 1; i <= size; i++) {

				Node node = q.poll();

				if (i==size) {
					System.out.print(node.data+" ");	
				}
				
				if (node.left!=null) {
					q.add(node.left);
				}
				

				if (node.right!=null) {
					q.add(node.right);
				}
			}
			
		}
	}

}
