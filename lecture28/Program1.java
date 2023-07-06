package lecture28;

import java.io.*;
import java.util.*;
public class Program1
{   static void func(int N){
    if(N >= 1){
        func(N-1);
        System.out.print(N + " ");
    }
}
	public static void main(String[] args) {
	    
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		func(N);
	}
	
}

