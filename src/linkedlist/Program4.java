package linkedlist;

import linkedlist.Program3.Node;

public class Program4 {
	public static void display(Node head) {
		while(head!= null){
			System.out.println(head.data+" ");
			head = head.next;
		}
	}
	
		public static class Node{
			int data;
			Node next;
			Node(int data){
				this.data = data;
			}
		}
			public static void main(String[] args) {
				
				
				Node a = new Node(1);
				Node b =  new Node(2);
				Node c = new Node (5);
				Node d = new Node(9);
				Node e = new Node(11);
				a.next = b;
				b.next = c;
				c.next = d;
				d.next = e;
				display(a);
				System.out.println();
		
}}