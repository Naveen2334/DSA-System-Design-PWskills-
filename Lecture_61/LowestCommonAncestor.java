package Lecture_61;

import java.util.ArrayList;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int x) {
		data = x;
		left = null;
		right = null;
	}
}

public class LowestCommonAncestor {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

	}
	public static boolean findPath(Node root, int n1, ArrayList<Integer> path1root.left,n,path) {
		if(root == null) {
			return false;
		}
		path.add(root.data);
		if(root.data== n|| findPath(root.left,n,path)||findPath(root.right,n,path))
		{
			return true;
		}
		path.remove(path.size()-1);
		return false;
	}
	   public static int findLCAInternal(Node root, int n1, int n2) {
	       ArrayList<Integer> path1 = new ArrayList<>();
	       ArrayList<Integer> path2 = new ArrayList<>();
	       if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
	           System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
	           System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
	           return -1;
	       }
	       int i;
	       for (i = 0; i < path1.size() && i < path2.size(); i++) {
	           if (!path1.get(i).equals(path2.get(i)))
	               break;
	       }
	       return path1.get(i - 1);
	   }
}

//do it again // i have copy it so do it agin
