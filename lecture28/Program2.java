package lecture28;


	import java.io.*;
	import java.util.*;
	public class Program2
	{   static void func(int N){
	    if(N >= 1){
	       
	        System.out.print(N + " ");
	         func(N-1);
	    }
	}
		public static void main(String[] args) {
		    
			System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			func(N);
		}
		
	}
