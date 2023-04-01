package lecture_44;

public class Sorting {
	public static void display(int num[])
	{
		for (int val : num) {
			System.out.print(val+" ");
			
		}
		System.out.println();
	}
	public static void swap(int a[],int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static void sort(int a[])
	{
		int lo=0, mid = 0,hi = a.length-1;
		while(mid <= hi) {
			if(a[mid] == 0)
			{
				swap(a, mid, lo);
				mid++;
				lo++;
				
				
			}
			else if(a[mid]==1) {
				mid++;
			}else {
				swap(a,mid,hi);
				hi--;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int num[] =  { 12,14,55,23,68,91};
		display(num);
		sort(num);
	}

}
