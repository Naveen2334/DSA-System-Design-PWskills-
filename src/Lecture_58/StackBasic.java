package Lecture_58;

import java.util.Stack;

public class StackBasic {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println(st.isEmpty());
		st.push(1);
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		System.out.println(st);
		st.push(23);
		System.out.println(st.size());
		System.out.println(st);
		st.push(98);
		System.out.println(st.size());
		System.out.println(st);
		st.push(5);
		System.out.println(st.size());
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println("the size of stack:::"+st.size());
		while(st.size()>2) {
			st.pop();
			
		}
		System.out.println(st.peek());
		System.out.println(st);
	}

}
