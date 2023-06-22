package Lecture_61;

import java.util.ArrayList;
import java.util.List;

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

public class RootToLeaf {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		List<List<Integer>> fina = Paths(root);
		/* printing paths from root to leaf */
		for (List<Integer> path : fina) {
			for (int i : path) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static void helper(Node root, List<Integer> arr, List<List<Integer>> ans) {
		if (root == null)
			return;
		arr.add(root.data);
		if (root.left == null && root.right == null) {
			ans.add(new ArrayList<Integer>(arr));
			return;
		}
		helper(root.left, new ArrayList<Integer>(arr), ans);
		helper(root.right, new ArrayList<Integer>(arr), ans);
	}

	public static List<List<Integer>> Paths(Node root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null)
			return ans;
		List<Integer> arr = new ArrayList<Integer>();
		helper(root, arr, ans);
		return ans;
	}

}