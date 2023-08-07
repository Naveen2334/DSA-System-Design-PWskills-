package Lecture_69;

import java.util.ArrayList;

class Node2{
	char data;
	ArrayList<Node2> children = new ArrayList<>();
	public Node2(char data) {
		this.data = data;
	}
	
}

public class DFS {
	public static void main(String[] args) {
		Node2 root = new Node2('A');
		(root.children).add(new Node2('B'));
		(root.children).add(new Node2('D'));
		(root.children).add(new Node2('E'));
		(root.children.get(0).children).add(new Node2('F'));
		(root.children.get(0).children).add(new Node2('G'));
		(root.children.get(0).children).add(new Node2('H'));
		(root.children.get(1).children).add(new Node2('I'));
		(root.children.get(1).children).add(new Node2('j'));
		(root.children.get(2).children).add(new Node2('K'));
		(root.children.get(2).children).add(new Node2('L'));
		(root.children.get(2).children).add(new Node2('M'));
		(root.children.get(2).children).add(new Node2('N'));
	    (root.children.get(2).children.get(2).children).add(new Node2('P'));
	    (root.children.get(2).children.get(2).children).add(new Node2('Q'));
	    System.out.println("Preorder traversal for the tree is::::");
	    preorder(root);
	    System.out.println("inorder traversal for the tree is::::");
	    inorder(root);
	    System.out.println("postorder traversal for the tree is::::");
	    postorder(root);
	   
	    
	}
	public static void preorder(Node2 root) {
		if(root == null) return;
		System.out.println(root.data+ " ");
		for(Node2 node : root.children) {
			preorder(node);
		}
	}
	public static void inorder(Node2 root) {
		if(root == null) return;
		for(int i=0;i < root.children.size()-1;i++) {
			inorder(root.children.get(i));
		}
		System.out.println(root.data + " ");
		if(root.children.size() > 1) inorder(root.children.get(root.children.size()-1));
	}
	public static void postorder(Node2 root) {
		if(root == null) return;
		for(Node2 node : root.children) {
			postorder(node);
			
		}
		System.out.println(root.data);
	}

}
