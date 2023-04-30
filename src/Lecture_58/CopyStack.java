package Lecture_58;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	Stack<Integer> st = new Stack<Integer>();
	int n;
	System.out.println("enter the  no element u want to insert::");
	 n = sc.nextInt();
	 System.out.println("enter the element");
	 for (int i = 0; i < n; i++) {
		 int x = sc.nextInt();
		 st.push(x);
	}
	 System.out.println(st);
	 
	 
	 //revere the order 
	 Stack<Integer> gt = new Stack<>();
	 while(st.size()>0) {
		 gt.push(st.pop());
	 }
	 
	 Stack<Integer> rt = new Stack<>();
	 while(gt.size()>0)
	 {
		 rt.push(gt.pop());
	 }
	 
	 System.out.println(rt);
	 System.out.println(gt);//stack get vacated
	 System.out.println(st);//stack get vacated
}
}
