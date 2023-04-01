package Lecture34;

import java.util.Scanner;

public class Pallindrome {
	
	
	public static boolean isPallindrome(String s, int l,int r) {
		if(l>=r) return true;
		return (s.charAt(l)==s.charAt(r)&&isPallindrome(s, l+1, r-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isPallindrome(s, 0, s.length()-1));

	}

}
