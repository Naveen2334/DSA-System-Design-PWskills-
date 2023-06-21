package Lecture_58;

import java.util.Stack;

public class RemoveFromBottom {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(56);
		st.push(66);
		st.push(76);
		st.push(86);
		//System.out.println(st);
		Stack<Integer> rt = new Stack<>();
		while(st.size()>1)
		{
			rt.push(st.pop());
		}
		//System.out.println(rt);
		
		st.pop();
		
		while(rt.size()>0)
		{
			st.push(st.pop());
		}
		System.out.println(st);
		
	}
}
