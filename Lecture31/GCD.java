package Lecture31;

import java.util.Scanner;

public class GCD {
	public static int gcd(int x,int y) {
		if(y == 0) {
			return x;
		}
		else {
			return gcd(y,x%y);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x,y");
		int x =  sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));

	}

}
