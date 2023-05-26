package Lecture34;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice string");
		String s = sc.next();
		System.out.println("=====");
		System.out.println(s.substring(7));
		System.out.println(s.charAt(5));
		System.out.println(s.codePointAt(0));
		
	}

}
