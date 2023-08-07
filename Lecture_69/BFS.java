package Lecture_69;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
class Node6{
	char data;
	ArrayList<Node6> children = new ArrayList<>();
	public Node6(char data) {
		this.data = data;
	}
}
public class BFS {
	public static void main(String args[]) {
	       Node6 root = new Node6('A');
	       (root.children).add(new Node6('B'));
	       (root.children).add(new Node6('F'));
	       (root.children).add(new Node6('J'));
	       (root.children.get(0).children).add(new Node6('C'));
	       (root.children.get(0).children).add(new Node6('D'));
	       (root.children.get(0).children).add(new Node6('E'));
	       (root.children.get(1).children).add(new Node6('G'));
	       (root.children.get(1).children).add(new Node6('H'));
	       (root.children.get(2).children).add(new Node6('K'));
	       (root.children.get(2).children).add(new Node6('L'));
	       (root.children.get(2).children).add(new Node6('M'));
	       (root.children.get(2).children).add(new Node6('N'));
	       (root.children.get(2).children.get(2).children).add(new Node6('P'));
	       (root.children.get(2).children.get(2).children).add(new Node6('Q'));
	 
	       System.out.println("Level order traversal for the tree is ");
	       levelOrderTraversal(root);
	       
	   }
	public static void levelOrderTraversal(Node6 root) {
		if(root == null) return ;
		Queue<Node6> q = new ArrayDeque<>();
		q.add(root);
		while(!q.isEmpty()) {
			int n = q.size();
			while(n>0) {
				Node6 p = q.peek();
				q.remove();
				System.out.println(p.data + " ");
				for(int i = 0;i<p.children.size();i++)
					q.add(p.children.get(i));
				n--;
				System.out.println();
			}
		}
		
		
	}
	
	

}
