package Lecture_60;
/*
 * print the element given queue using add(),remove(),peek(),size() & extra queue.
 */
import java.util.LinkedList;
import java.util.Queue;

public class Queue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(5);
		Queue<Integer> helper = new LinkedList<>();

		while(q.size()>0)
		{
			System.out.println(q.peek());
			helper.add(q.poll());
		}
		while(helper.size()>0)
		{
			q.add(helper.poll());
		}
	}

}
