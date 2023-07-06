package lecture_59;

import java.util.Arrays;

public class PermutaionString   {
	public static void main(String[] args) {
		String s = "bac";
		printPermutations(s);
	}
	

	public static void printPermutations(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		generatepermutation(arr, 0);
	}
	
	private static void generatepermutation(char[] arr,int index) {
		if(index == arr.length) {
			System.out.println(new String(arr));
			return;
		}
		for(int i =index;i<arr.length;i++) {
			swap(arr,index,i);
			generatepermutation(arr, index+1);
			swap(arr,index+1, i);
		}
	}
	
	public static void swap(char[] arr,int i,int j) {
		char temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}

}
