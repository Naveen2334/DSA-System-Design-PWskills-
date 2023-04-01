package lecture_46;

public class RoatatedBinarySearch {
	public static int findMinimum(int a[])
	{
		int n = a.length;
		int st = 0;
		int end = n-1;
		int ans = -1;
		while(st<= end) {
			//why output is not comming and why we take mid after while?
			//discuss why algorith is not understanding
			int mid= st+(end-st)/2;
			if(a[mid]<=a[n-1])
			{
				ans = mid;
				end = mid-1;
			}
			else {
				st = mid-1;
			}
		}
		return ans;
	}
public static void main(String[] args) {
	int a[]= {3,4,5,6,1,2};
	System.out.println(findMinimum(a));
}
}
