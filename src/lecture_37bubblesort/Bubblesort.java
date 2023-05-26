package lecture_37bubblesort;

public class Bubblesort {
 public static void bubbleSort(int[] a)
 {
	 int n = a.length;
	 for(int i = 0;i<n-1;i++)
	 {
		 boolean flag = false;
		 for(int j= 0;j<n-1;j++)
		 {
			 if(a[j]>a[j+1])
			 {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag = true;
				
			 }
		 }
		 if(!flag)
		 {
			 return;
		 }
	 }
	 
 }
 public static void main(String[] args) {
	int a[] = {5,4,1,2,3,6,0};
	for (int i : a) {
		System.out.println(i+ " ");
	}
}
}
