package Lecture_61;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val = val;
		left = null;
		right = null;
	}
}
public class BinaryTreeMaxNode {
	
	Public static TreeNode findMaxNode(TreeNode root,TreeNode maxNode)
	{
		if(root==null) {
			return maxNode;
		}
		if(root.val > maxNode.val) {
			maxNode = root;
		}
		if(leftMax.val > maxNode.val) {
		    maxNode = rightMax;	
		}
	}
}
