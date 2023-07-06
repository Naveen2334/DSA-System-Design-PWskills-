package lecture28;

import java.util.Iterator;

public class Fibonacci {
	
	

	static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
		
	}
	public static void main(String[] args) {
		
		for(int i = 0;i<10;i++) {
			System.out.println(fib(i));
		}
	}

}
