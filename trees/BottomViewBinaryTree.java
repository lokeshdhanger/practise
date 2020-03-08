package trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * time complexity: O(n)
 * space complexity: O(n)
 * 
 * @author xarvis
 *
 */
public class BottomViewBinaryTree {
	
	static class Node {
		int data;
		Node left;
		Node right;
		int hd; //horizontal distance from center.
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	static Node root;
	
	
	public static void main(String[] args) {
		
		root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.left.left=new Node(5);	
		root.left.right=new Node(3);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(14);
		root.right.right=new Node(25);
		root.right.left=new Node(4);
		
		bottomView();
		
	}
	
	public static void bottomView() {
		
		if (null==root) {
			return;
		}
		
		int hd=0;
		Map<Integer, Integer> map = new TreeMap<>();
		
		Queue<Node> q = new LinkedList<>();
		root.hd=hd;
		q.add(root);
		
		while (!q.isEmpty()) {
			Node node = q.remove();
			hd=node.hd;
			map.put(hd, node.data);
			
			if (node.left!=null) {
				node.left.hd=hd-1;
				q.add(node.left);
			}
			
			if (node.right!=null) {
				node.right.hd=hd+1;
				q.add(node.right);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.print(entry.getValue()+" ");
		}
	}

}
