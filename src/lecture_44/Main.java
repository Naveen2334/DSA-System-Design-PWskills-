package lecture_44;

// why i ma not getting sorted array 

public class Main {
	
	public static void displayArr(int num[]) {
		for (int val : num) {
			
			System.out.println(val+ " ");
			
		}
		System.out.println();
	}
	public static void sort(int num[])
	{
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int j : num) {
			if(j == 0) {
				count0++;
			}else if(j == 1)
			{
				count1++;
				
			}
			else {
				count2++;
			}
			
		}
		int  k = 0;
		while(count0 >0)
		{
			num[k++] = 0;
			count0--;
			
		}
		while(count1 >0 )
		{
			num[k++] =1;
			count1--;
		}
		while(count2>0)
		{
			num[k++]=1;
			count2--;
		}
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num [] = {2,2,1,2,2,0,1,0,2,0};
		//displayArr(num);
		sort(num);

	}

}
