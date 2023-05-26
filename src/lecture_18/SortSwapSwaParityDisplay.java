package lecture_18;

public class SortSwapSwaParityDisplay {
public static void printArray(int arr[])
{
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+ " ");
		
	}
	System.out.println();
}
public static void swap(int arr[], int i, int j)
{
	int temp = arr[i];
	arr[i]= arr[j];
	arr[j] = temp;
	
}
// sortArraybyParity is not working?
public static void sortArrayByParity(int arr[])
{
	int n= arr.length;
	int left = 0; 
	int right = n-1;
	
	while(left < right) {
		if(arr[left]%2 == 1 &&  arr[right]%2 ==0 )
		{
			swap(arr, left, right);
			left++;
			right--;
			
		}
		if(arr[left]%2 == 0)
		{
			left++;
		}
		if(arr[right]%2 ==1) {
			right -- ;
			
		}
	}
}
public static int[] sortSquare(int arr[])
{
	int n = arr.length;
	int left = 0,right= n-1;
	int ans[] = new int [n];
	int k = n-1;
	while(left <= right)
	{
		if(Math.abs(arr[left])> Math.abs(arr[right])) {
			ans[k--]= arr[left]*arr[left];
			r
		}
	}
	
	
	return arr;
	
}
public static void main(String[] args) {
	int arr[] = {10,12,20,30,40,23};
	System.out.println("sorted array");
	printArray(arr);
	sortArrayByParity(arr);
	
}
	
}
