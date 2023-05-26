package lecture_45;

public class SearchAndDuplicate {
public static int search(int a[],int target)
{
	int st = 0,end = a.length-1;
	while(st <= end)
	{
		int mid = st +(end-st)/2;
		if (a[mid]==target) {
			return mid;
			
		}
		else if(a[mid]<a[end])
		{
			if(target>a[mid]&& target <= a[end])
			{
				st = mid+1;
			}else {
				end = mid -1;
			}
		}else {
			if(target>=a[st]&& target <a[mid]) {
				end = mid-1;
			}else {
				st = mid+1;
			}
		}
	}
	return -1;
}

public static int dublicate(int a[],int target)
{
	int st = 0;
	int end =a.length-1;
	int mid = st + (end-st)/2;
	
	while(st<=end) {
		while(st <= end)
		{
			if(a[mid] == target)
			{
				return mid;
				
			}
			else if(a[st] == a[mid] && a[end] == mid)
			{
				st++;
				end--;
				
			}
			else if(a[mid]>a[end])
			{
				if(target > a[mid] && target <=a[end])
				{
					st = mid+1;
					
				}
				else {
					end = mid-1;
				}
				
			}
			else
			{
				if(target >= a[st]&& target < a[end])
				{
					end = mid-1;
				}
				else {
					st = mid+1;
				}
			}
		}
		
		
	}
	return -1;
}


public static void main(String[] args) {
	int a[] = {1,2,1,1,1,3,1};
	int target =2;
	//System.out.println(search(a, target));
	System.out.println("======");
	System.out.println(dublicate(a, target));
}
}
