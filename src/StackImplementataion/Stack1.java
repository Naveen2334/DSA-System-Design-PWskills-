package StackImplementataion;

public class Stack1 {
	
	static final int max = 1000;
	int top;
	int a[] =  new int[max];
	boolean isEmpty()
	{
      if(top<0)
      {
    	  top = -1;
      }
	return false;
	}
	boolean push(int x)
	{
		if(top >= (max-1))
		{
			System.out.println("stack overflow");
			return false;
		}
		++top;
		a[top]=x;
		return true;
	}
	int pop()
	{
		if(top < 0)
		{
			System.out.println("stack underflow");
			return 0;
		}
		else {
			top--;
			int x = a[top];
			return 0;
		}

	}
	void diplay() {
		for(int i =  top;i>-1;i--)
		{
			System.out.println("  "+a[i]);
		}
	}
	public static void main(String[] args) {
		Stack1 st = new Stack1();
		st.push(10);
		st.push(20);
		st.push(50);
		//st.diplay();
		st.pop();
		st.diplay();
	}

}
