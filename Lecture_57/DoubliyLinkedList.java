package Lecture_57;

public class DoubliyLinkedList {
	public static class Node{
		
		//Node mai jo value store hoga
		int val;
		
		// node ka do object banao next and prev
		Node next;
		Node prev;
		
		// constructor of Node
		Node(int val)
		{
			this.val = val;
		}
	}
	// diplay in forward dirction
	public static void display(Node head) {
		
		//here we have taken temp as object
		Node temp = head;
		while(temp!= null)
		{
			System.out.println(temp.val+" ");
			temp=  temp.next;
		}
		System.out.println();
	}
	// diplay node in reverse order
	public static void displayrev(Node tail) {
		Node temp = tail;
		while(temp!= null)
		{
			System.out.println(temp.val+" ");
			temp=  temp.prev;
		}
		System.out.println();
	}
	
	//to display all node form any node
	public static void displayRndom(Node random)
	{
		Node temp =  random;
		
		while(temp.prev != null)
		{
			System.out.println(temp.val+ " ");
			temp = temp.prev;
			
		}
		while(temp != null) {
			System.out.println(temp.val+"");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node InsertAtHead(Node head, int x)
	{
		Node t = new Node(9);
		t.next = head;
		head.prev = t;
		head = t;
		return head;
		
	}
	public static Void insertAtTail(Node head , int x)
	{
		
		Node temp = head;
		while(temp.next != null)
		{
			temp =  temp.next;
		}
		Node t = new Node(x);
		temp.next = t;
		t.prev = temp;
		
		
		return null ;
		
	}
	public static void insertAtIndex(Node head,int idx,int x)
	{
		Node s = head;
		for(int i=1;i<=idx;i++)
		{
			s = s.next;
		}
		Node r =  s.next;
		Node t = new Node(x);
		s.next = t;
		t.prev = s;
	}
	public static void main(String[] args) {
		Node a = new Node(4);
		Node b = new Node(10);
		Node c =  new Node(6);
		Node d =  new Node(99);
		Node e =  new Node(13);
		a.prev = null;
		a.next = b;
		b.prev = a;
		b.next = c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		e.next =  null;
//		display(a);
//		displayrev(e);
//		displayrev(b);
//	    displayRndom(b);
//		Node newHead = InsertAtHead(a,35);
//		display(newHead);
	//	insertAtTail(a, 90);
		insertAtIndex(a, 3, 56);
		display(a);
		
	}
}
