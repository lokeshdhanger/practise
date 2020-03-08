package trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class TopViewOfBinaryTree {
	
	static class Node {
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	
	static class QueueNode {
		int hd;
		Node node;
		
		public QueueNode(Node node, int hd) {
			this.hd=hd;
			this.node=node;
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
		
		topView();
		
	}
	
	public static void topView() {
		
		
		
		Queue<QueueNode> q = new LinkedList<>();
		Map<Integer, Node> map = new TreeMap<Integer, Node>();
		
		if (root==null) {
			return;
		} else {
			q.add(new QueueNode(root, 0));
		}
		
		while (!q.isEmpty()) {
			
			QueueNode queueNode = q.poll();
			
			if (!map.containsKey(queueNode.hd)) {
				map.put(queueNode.hd, queueNode.node);
			}
			
			if (queueNode.node.left!=null) {
				q.add(new QueueNode(queueNode.node.left, queueNode.hd-1));
			}
			if (queueNode.node.right!=null) {
				q.add(new QueueNode(queueNode.node.right, queueNode.hd+1));
			}
			
		}
		
		Set<Entry<Integer, Node>> entrySet = map.entrySet();
		
		for (Entry<Integer, Node> entry : entrySet) {
			System.out.print(entry.getValue().data+" ");
		}
		
	}

}
