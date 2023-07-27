package Lecture_69;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

 class Node1{
	int key;
	List<Node1> child;
	public Node1(int key) {
	this.key = key;
		child = new ArrayList<Node1>();
	}
}

public class MIRROR_OF_N_ARY_TREE 
{
	public static void main(String[] args) {
		Node1 root =  new Node1(10);
		root.child.add(new Node1(2));
		root.child.add(new Node1(34));
		root.child.add(new Node1(56));
		root.child.add(new Node1(100));
		root.child.get(2).child.add(new Node1(1));
		root.child.get(3).child.add(new Node1(7));
		root.child.get(3).child.add(new Node1(8));
		root.child.get(3).child.add(new Node1(8));
		int i = 0;
		mirrorTree(root.child.get(i));
		Collections.reverse(root.child);

	}
	public static void mirrorTree(Node1 root) {
		if(root==null) return;
		int n = root.child.size();
		if(n<2) return;
		for(int i = 0;i<n;i++)
		{
			mirrorTree(root.child.get(i));
			Collections.reverse(root.child);
			
		}}
		public static void printNodeLevelWise(Node1 root) {
		if(root == null) return ;
		Queue<Node1> q = new ArrayDeque<>();
		q.add(root);
		while(!q.isEmpty()) {
			int n = q.size();
			while(!q.isEmpty()) {
				int n1 = q.size();
				while(n>0) {
					Node1 p = q.poll();
					System.out.println(p.key + " ");
					for(int i = 0 ;i <p.child.size();i++)
						q.add(p.child.get(i));
					n--;
				}
				System.out.println();
			}
		}
		
		}
	

}
