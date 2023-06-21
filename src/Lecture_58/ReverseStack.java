package Lecture_58;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
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
	 
	 
	 //revere the order but in different stack it happen but if you want to reverse stack and want to stoe in first stack then u have to use threee stack
	 Stack<Integer> rt = new Stack<>();
	 while(st.size()>0) {
		 rt.push(st.pop());
	 }
	 //System.out.println(rt);
	 Stack<Integer> gt = new Stack<>();
	 while(rt.size()>0)
	 {
		 gt.push(rt.pop());
	 }
	 while(gt.size()>0)
	 {
		 st.push(gt.pop());
	 }
	 System.out.println(st);
}
}
