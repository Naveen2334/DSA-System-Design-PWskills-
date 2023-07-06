package Lecture_61;

public class Concept1 {
	public static class Node{
		int val;
		Node left;
		Node Right;
		public Node(int val) {
			this.val = val;
		}
	}
	public static void display(Node root) {
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.Right.val);
		display(root.left);
		display(root.Right);

	}
	
	public static void main(String[] args) {
		//Node root = new Node();
		//root.val = 10;
		//insert value via constructor
		Node root = new Node(10);
		Node a = new Node(2);
		Node b = new Node(56);
		root.left=a;
		root.Right = b;
		Node c = new Node(6);
		Node d = new Node(7);
		a.left = c;
		a.Right = d;
		Node e = new Node(15);
		Node f = new Node(12);
		b.left = f;
		b.Right = e;

	//	System.out.println(root.val);
		System.out.println(root.left);
		System.out.println(root.val);
	}
	
}
