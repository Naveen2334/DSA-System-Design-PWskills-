package Lecture_58;

import java.util.Stack;

public class InsertfromBottom {
public static void main(String[] args) {
	Stack<Integer> st = new Stack<>();
	st.push(56);
	st.push(66);
	st.push(76);
	st.push(86);
	
	System.out.println(st);
	int idx =2;
	int x =7;
	
	Stack<Integer> temp = new Stack<>();
	while(st.size()>2)
	{
		temp.push(st.pop());
	}
	st.push(x);
	while(temp.size()>0) {
		st.push(temp.pop());
	}
	System.out.println(st);
}
}
