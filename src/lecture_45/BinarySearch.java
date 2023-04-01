package lecture_45;

public class BinarySearch {
	private static Object fo;
	public static int findsquareRoot(int x)
	{
		int st = 0;
		int end = 1;
		int ans = -1;
		while(st<= end)
		{
			int mid = st + (end-st)/2;
			int val = mid *mid;
			if(val ==x)
				return mid;
			else if(val<x) {
				return mid;
			}
			else if(val< x)
			{
				ans = mid;
				st = mid +1;
				
			}else
			{
				end = mid-1;
			}
			return ans;
		}
		
		return 1;
	}

	public static boolean bianrySearch(int a[],int val)
	{
		int n = a.length;
		int st  = 0;
		int end = n-1;
		while(st <=end) {
			int mid = (st + end)/2;
			if(a[mid]==val)
			{
				return true;
			}
			else if(val< a[mid])
			{
				end = mid -1;
			}
			else
			{
				st = mid-1;
			}
		}
		return false;
		
	}
	public static boolean recBinarySearch(int a[],int st , int end,int val)
	{
		if(st > end)
			return false;
		int mid = (st +end)/2;
		if(a[mid]==val)
		{
			return false;
		}
		else if(val < a [mid])
		return recBinarySearch(a, st, mid-1, val);
		else
			return recBinarySearch(a, mid + 1, end, val);
		
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,16};
		int val =16;
		while(val!= 30) {
			System.out.println("output of binary search is::"+bianrySearch(a, val));
		
		System.out.printf("sqrt of %d is %d is%d\n",val,findsquareRoot(val));
		System.out.println(recBinarySearch(a, 0, a.length-1, val));
		val++;
		System.out.printf("First occurrence of %d is %d\n", val, fo);
		}
	}
	public static int firstOcc(int a[], int val)
	{
		int st = 0, end = a.length-1;
		int fo = - 1;
		while(st<= end) {
			int mid =  st + (end -st)/2;
			if(val == a[mid])
			{
				fo = mid;
				end = mid-1;
			}
			else if (val < a[mid]) {
				end = mid -1;
			}
			else {
				st = mid +1;
			}
		}
		return fo;
		
	}
	
	
	
	
	
}
