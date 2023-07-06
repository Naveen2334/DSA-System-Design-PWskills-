package stacks_Infix_Prefix_Postfix_expressions_Lecture_56_youtube;

import java.util.Stack;

public class Infix {
public static void main(String[] args) {
	int x = 9-5+3+4/6;
	System.out.println("calculated value:::"+x);
	String y = "9-5+3+4/6";
	System.out.println("calculate value::"+y);
	Stack<Integer> val = new Stack<>();
	Stack<Character> op = new Stack<>();
	for (int i = 0; i < y.length(); i++) {
		char ch = y.charAt(i);
		int ascii = (int)ch;
		if(ascii>=48&&ascii<=57) val.push(ascii-48);
		else if (op.size()==0|| ch=='('||op.peek()=='(') {
			op.push(ch);
		}
		else if(ch==')')
		{
			while(op.peek()!='(')
			{
				int v2 = val.pop();
				int v1 =val.pop();
				if(op.peek()=='-') val.push(v1-v2);
				if(op.peek()=='+') val.push(v1+v2);
				if(op.peek()=='*') val.push(v1*v2);
				if(op.peek()=='/') val.push(v1/v2);
				op.pop();
			}
		
		}
		else {
			if(ch=='+'|| ch=='-')
			{
				int v2 = val.pop();
				int v1 =val.pop();
				if(op.peek()=='-') val.push(v1-v2);
				if(op.peek()=='+') val.push(v1+v2);
				if(op.peek()=='*') val.push(v1*v2);
				if(op.peek()=='/') val.push(v1/v2);
				op.pop();
				op.push(ch);
				
			}if(ch=='*'||ch=='/') {
				if(op.peek()=='*'||op.peek()=='/') {
					int v2 = val.pop();
					int v1 =val.pop();
					if(op.peek()=='*') val.push(v1*v2);
					if(op.peek()=='/') val.push(v1/v2);
					op.pop();
					op.push(ch);
				}
				else op.push(ch);
			}
		}
	}
	//val stack size--->
	while(val.size()>1)
	{
		int v2 = val.pop();
		int v1 =val.pop();
		if(op.peek()=='-') val.push(v1-v2);
		if(op.peek()=='+') val.push(v1+v2);
		if(op.peek()=='*') val.push(v1*v2);
		if(op.peek()=='/') val.push(v1/v2);
		op.pop();
	
	}
	System.out.println(":::::"+op.peek());
 }
}
