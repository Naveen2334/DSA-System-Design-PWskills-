package Lecture_61;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class BinaryTreeSum {
	
	public static int sum(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		int leftSum = sum(root.left);
		int rightSum = sum(root.right);
		
		return root.val + leftSum + rightSum;
	
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right =  new TreeNode(4);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(8);
		System.out.println("the sum of value iS:::"+sum(root));
	}
	
}
