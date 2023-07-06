package Lecture_60;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	System.out.println(q.isEmpty());
	q.add(1);
	System.out.println(q.isEmpty());
	q.add(2);
	q.add(3);
	
	q.add(5);
	System.out.println(q);
	q.remove();
	System.out.println(q);
	q.poll();
	//here remove and poll work in same fashion...
	System.out.println(q);
	//element(),peek() both hava same value
	System.out.println(q.element());
	System.out.println(q.peek());
	System.out.println(q.size());
}
}
