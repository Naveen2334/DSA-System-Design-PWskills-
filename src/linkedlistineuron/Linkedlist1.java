package linkedlistineuron;

import java.util.Iterator;

class Node{
	int data;
	Node next;
}



public class Linkedlist1 {
	
	Node head;
	Linkedlist1() {
	head = null;	
	}
	
	void push_back(int newElement)
	{
		Node newNode = new Node();
		newNode.data = newElement;
		newNode.next = null;
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = new Node();
			temp  = head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next = newNode;
		}
		
		
		
	}
	void push_at(int newElement , int position) {
		Node newNode = new Node();
		newNode.data = newElement;
		newNode.next = null;
		int postion = 0;
		if(position < 1)
		{
			System.out.println("\n position should be >=1.");
			
		}
		else if(postion == 1){
			newNode.next = head;
			head = newNode;
			
			
			
		}
		else {
			Node temp = new Node();
			temp = head;
			for(int i = 1;i<position-1;i++)
			{
				if(temp!=null) {
					temp = temp.next;
				}
			}
			if(temp != null) {
				newNode.next = newNode;
				
			}
			else {
				System.out.println("the previous node is null");
				
			}
		}
	}
void printlist()
{
	Node temp = new Node();
	temp = this.head;
	if(temp != null) {
		System.out.println("The list contains:");
		temp = temp.next;
	}
	
	
	else {
		System.out.println("the list is empty");
	}
}
public static void main(String[] args) {
	LinkedList myList = new LinkedList();
	
}
}
