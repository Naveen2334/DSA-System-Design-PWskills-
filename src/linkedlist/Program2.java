package linkedlist;

import linkedlist.Program1.Node;

public class Program2 {
	public static class Node {
		int data;//value
		Node next;//address of next node //Here Node is datatype
		Node(int data){// constructor
			this.data = data;
		}
//		
		
	}
	public static void main(String[] args) {
		Node x= new Node(5);
		
		Node a= new Node(4);
		//System.out.println(a.next);
		Node b= new Node(3);
		Node c= new Node(2);
		Node d= new Node(16);
		Node e= new Node(13);
		//5 4 3 2 16 13
		a.next = b;//  5 -> 4 3 2 16 13
		b.next = c;//  5 -> 4 -> 3 2 16 13 
		c.next = d;//  5 -> 4 -> 3-> 2 16 13
		d.next = e;//  5 -> 4 -> 3-> 2 -> 16 -> 13
		System.out.println(a.next);
		// output linkedlist.Program2$Node@626b2d4a
		System.out.println(b);
		//linkedlist.Program2$Node@626b2d4a
		System.out.println(b.next);
		System.out.println(c);
		System.out.println(c.next);
		System.out.println(d.next);
		System.out.println(e.next);
		
		
		System.out.println(a.data);
		
		System.out.println(b.data);
		System.out.println(c.data);
		System.out.println(d.data);
		System.out.println(e.data);
		System.out.println(a.next.data);
		System.out.println(b.next.data);
		
		System.out.println(c.next.data);
		System.out.println(d.next.data);
		
	
		System.out.println(b.next.data);//store data of c

		System.out.println(b.next.next.data);// store data of d

		System.out.println(b.next.next.next.data);// store data of e

		System.out.println(b.next.data);
	
		System.out.println(c.next.data);
		System.out.println(d.next.data);
		//System.out.println(e.next.data);   java.lang.NullPointerException: Cannot read field "data" because "e.next" is null
		//at linkedlist.Program2.main(Program2.java:53)
		
	}

}
