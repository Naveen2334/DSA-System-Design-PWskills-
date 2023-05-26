package Lecture33;
//do it again
public class ArrayIndexRecursion {
	public static void allIndices(int a[],int n,int x,int idx)
	{
		if(idx>=n)
			return;
		if(a[idx] == x)
			System.out.println(idx);
		allIndices(a, n, x, idx+1);
	}
	public static int firstIndex(int a[],int n,int target,int idx) {
		
		if(idx==n) {
			return -1;
			
		}
		if(a[idx] ==target)
			return idx;
		return firstIndex(a, n, target, idx+1);
		
	}
	public static int lastIndex(int a[],int n, int target,int idx) {
		if(idx ==-1)
			return -1;
		if(a[idx]==target) {
			return idx;
		}
		return idx;
	}
	public static void main(String[] args) {
		int target=4;
		int[] a = {10,20,30,58,54,65};
		int n =a.length;
		allIndices(a , n , target, 0);
		System.out.println("==========");
		System.out.println(firstIndex(a,n,target,0));
		System.out.println("=========");
	}
}
