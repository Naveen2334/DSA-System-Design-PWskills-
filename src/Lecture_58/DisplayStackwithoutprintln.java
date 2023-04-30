package Lecture_58;

import java.util.Stack;

public class DisplayStackwithoutprintln {
	public static void displayRec(Stack<Integer> st)
	{
		st.push(5);
		System.out.println(st);
	}
	public static void displayRecRev(Stack<Integer> st)
	{
		if(st.size()==0)
		return;
		int top = st.pop();
		System.out.println(top+" ");
		displayRecRev(st);
		st.push(top);
	}
	
public static void main(String[] args) {
	Stack<Integer> st = new Stack<>();
	st.push(56);
	st.push(66);
	st.push(76);
	st.push(86);
	
	System.out.println(st);
	//print recurssibly
	displayRec(st);
	//reverse order recursivly
	displayRecRev(st);
	//print via different stack
	/*Stack<Integer> rt = new Stack<>();
	while(st.size()>0)
	{
		int x = st.pop();
		rt.push(x);
		
	}
	while(rt.size()>0)
	{
		int y = rt.pop();
		
		st.push(y);
		System.out.println(y+" ");
		
	}
	*/
	//print via different array 
	/*
	int n = st.size();
	int arr[] = new int[n];
	for(int i =n-1;i>=0;i--)
	{
		arr[i] =st.pop();
	}
	for (int i = 0; i <n; i++) {
		System.out.println(arr[i]+" ");
		st.push(arr[i]);
	}
	*/
}
}