package Lecture_61;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int x) {
		this.data = x;
		this.left = null;
		this.right = null;
	}
}

public class PrintDiameter {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println(diameter(root));

	}
	public static int diameter(Node root) {
		if(root == null) return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);
		return Math.max(lh+rh, Math.max(ldiameter, rdiameter));
	}
	public static int height(Node node) {
		if(node == null) return 0;
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh)+1;
	}
}
