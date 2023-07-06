package Lecture32;

public class ArrayRecursion {
	public static int printArray(int arr[],int idx)
	{
		if(idx == arr.length)
			
		     return idx;
		System.out.println(arr[idx]);
		return printArray(arr, idx+1);
		

		
	}
	public static int maxInArray(int arr[],int idx) {
		if(idx == arr.length-1)
		{
			return arr[idx];
		}
		
		
		
		return idx;
		
	}
	public static int sumofArray(int arr[],int idx) {
		if(idx == arr.length) {
			return 0;
		}
		int smallAns =  sumofArray(arr,idx+1);
		return smallAns+arr[idx];
	}
	

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		// TODO Auto-generated method stub
		printArray(arr,5);
		System.out.println(maxInArray(arr,0));
		System.out.println(sumofArray(arr, 0));

	}

}
