package linkedlist;

import java.util.Iterator;

public class Program3 {
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
	Node temp =  a;
//	for(int i = 1; i<=5;i++)
//	{
//		System.out.println(temp.data+" ");
//		temp =  temp.next;}
//	}
	while(temp!=null)
	{
		System.out.println(temp.data+" ");
		temp =  temp.next;}
	}
	
	}	


