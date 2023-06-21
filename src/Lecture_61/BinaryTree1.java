package Lecture_61;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree1 {
	Node root;
	void printNodeAtLevel(Node node,int level) {
		if(node == null)
			return;
		if(level == 1) {
			System.out.println(node.data + " ");
		}
		else if(level >1) {
			printNodeAtLevel(node.left, level-1);
			printNodeAtLevel(node.right, level-1);
		}
	}
	
	int getHeight(Node node) {
		if(node == null)
		return 0;
		else {
			int leftHeight = getHeight(node.left);
			int rightHeight = getHeight(node.right);
			return Math.max(leftHeight , rightHeight) + 1;
		}
	}
	void printNthLevelElement(int level) {
		printNodeAtLevel(root,level);
	}
	public static void main(String[] args) {
		BinaryTree1 tree = new BinaryTree1();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.left = new Node(7);
		tree.root.right.right.left = new Node(8);
		tree.root.right.right.left = new Node(9);
		int level = 3;
		System.out.println("element at level::::"+level+":");
		tree.printNthLevelElement(level);
		
	}

}
